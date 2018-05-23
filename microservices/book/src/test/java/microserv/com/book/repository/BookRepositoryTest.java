package microserv.com.book.repository;

import microserv.com.book.domain.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BookRepositoryTest {
    @Autowired
    private BookRepository repository;

    @Test
    public void save() {
        Book book = new Book();
        book.setId(1);
        book.setName("Donky Hot");
        book.setPages(550);
        book.setYear(1991);

        repository.save(book);
    }

    @Test
    public void findById() {
        Book book = repository.findOne(1L);
        System.out.println(book);
    }
}