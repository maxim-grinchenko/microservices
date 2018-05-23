package microserv.com.book.client;

import microserv.com.book.domain.Hit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LoggingClientTest {
    @Autowired
    private LoggingClient client;

    @Test
    public void getHitsByBookId() {
        List<Hit> hits = client.getHitsByBookId(1);
        System.out.println(hits);
    }
}