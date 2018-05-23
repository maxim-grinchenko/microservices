package microserv.com.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
@Document
public class Hit {
    @Indexed
    private Long id;
    private String ip;
    private String browser;
    private LocalDateTime viewed;
    private String bookId;
}
