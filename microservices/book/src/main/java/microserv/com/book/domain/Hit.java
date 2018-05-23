package microserv.com.book.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import microserv.com.book.serializers.LocalDateDeserializer;
import microserv.com.book.serializers.LocalDateSerializer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class Hit {
    private String userName;

    private String ip;

    private String browser;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDateTime viewed;

    private String applicationName;

    private long bookId;
}