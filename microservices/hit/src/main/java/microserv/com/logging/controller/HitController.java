package microserv.com.logging.controller;

import microserv.com.logging.domain.Hit;
import microserv.com.logging.repository.HitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/hit")
@Slf4j
@RequiredArgsConstructor
public class HitController {
    @Value("${hit.value}")
    private String hitValue;

    private final HitRepository repository;

    @GetMapping("get/hit")
    public String getHit() {
        return hitValue;
    }

    @PostMapping("/save")
    public void save(@Valid @RequestBody Hit hit) {
        LOGGER.info("Save hit:{}", hit);
        repository.save(hit);
    }

    @GetMapping("get/by/book/id/{bookId}")
    public List<Hit> getHitsByBookId(@PathVariable long bookId) {
        LOGGER.info("Get hits by book id:{}", bookId);
        List<Hit> hits = repository.findByBookId(bookId);
        LOGGER.info("Found hits:{}", hits);
        return hits;
    }
}