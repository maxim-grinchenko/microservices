package microserv.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApplication.class, args);
        //  SpringApplication app = new SpringApplication(RestTrainingApplication.class);
        // app.setBannerMode(Banner.Mode.OFF);
        // app.run(args);
    }
}