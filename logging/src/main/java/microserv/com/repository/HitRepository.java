package microserv.com.repository;

import microserv.com.model.Hit;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HitRepository extends MongoRepository<Hit, Long> {
    List<Hit> findBookId(long bookId);
}
