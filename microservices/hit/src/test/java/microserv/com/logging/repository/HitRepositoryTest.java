package microserv.com.logging.repository;

import microserv.com.logging.domain.Hit;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.Assert.fail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HitRepositoryTest {
    @Autowired
    private HitRepository repository;

    @Test
    public void save() {
        Hit hit = new Hit();
        hit.setApplicationName("Iphone");
        hit.setBrowser("Opera");
        hit.setBookId(1);
        hit.setViewed(LocalDateTime.now());
        hit.setIp("123.134.133");


        Hit hit1 = new Hit();
        hit1.setApplicationName("Android");
        hit1.setBrowser("Chrome");
        hit1.setBookId(1);
        hit1.setViewed(LocalDateTime.now());
        hit1.setIp("123.134.134");

        try {
            repository.save(hit);

            Thread.sleep(3000L);

            repository.save(hit1);
        } catch (Exception ex) {
            ex.printStackTrace();
            fail();
        }
    }

    @Test
    public void getById() {
        List<Hit> hits = repository.findByBookId(1);
        System.out.println(hits);
    }
}