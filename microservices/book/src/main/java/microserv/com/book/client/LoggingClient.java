package microserv.com.book.client;

import microserv.com.book.domain.Hit;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "hit")
public interface LoggingClient {
    @GetMapping("/hit/get/by/book/id/{bookId}")
    List<Hit> getHitsByBookId(@PathVariable ("bookId")long bookId);
}