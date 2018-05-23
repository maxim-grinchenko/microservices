package microserv.com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Transient;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Book {

    private long id;
    private String name;

    @Transient
    private String author;
}
