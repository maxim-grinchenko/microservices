package microserv.com.logging.repository;

import microserv.com.logging.domain.Hit;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HitRepository extends MongoRepository<Hit, Long> {
    List<Hit> findByBookId(long bookId);
}