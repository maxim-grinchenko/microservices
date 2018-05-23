package microserv.com.logging.domain;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import microserv.com.logging.infra.serializers.LocalDateDeserializer;
import microserv.com.logging.infra.serializers.LocalDateSerializer;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString

@Document
public class Hit {
    @Indexed
    private String userName;

    private String ip;

    private String browser;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDateTime viewed;

    private String applicationName;

    private long bookId;
}