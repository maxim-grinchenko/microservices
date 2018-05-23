package microserv.com.book.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import microserv.com.book.client.LoggingClient;
import microserv.com.book.domain.Book;
import microserv.com.book.domain.Hit;
import microserv.com.book.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@RefreshScope
@Slf4j
@RequiredArgsConstructor
public class BookController {
    @Value("${library.name}")
    private String libraryName;

    private final BookRepository bookRepository;
    private final LoggingClient loggingClient;

    @GetMapping("/library")
    public String getLibraryName() {
        return libraryName;
    }

    @GetMapping("/find/all")
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/find/by/{id}")
    @HystrixCommand(fallbackMethod = "getBookFallBack")
    public Book getBook(@PathVariable long id) {
        List<Hit> hits = loggingClient.getHitsByBookId(id);

        Book book = bookRepository.findOne(id);
        book.setHits(hits);
        return book;
    }

    public Book getBookFallBack(long id) {
        return bookRepository.findOne(id);
    }

    @PostMapping
    public void saveBook(@RequestBody Book book) {
        bookRepository.save(book);
    }
}