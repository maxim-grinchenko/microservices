package microserv.com.controller;

import microserv.com.model.Hit;
import microserv.com.repository.HitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController("/hit")
@Slf4j
@RequiredArgsConstructor
public class HitController {

    private HitRepository repository;

    @PostMapping("/save")
    public void save(@Valid @RequestBody Hit hit) {
        repository.save(hit);
    }

    @GetMapping("get/by/book/id/{bookId}")
    public List<Hit> getHitsByBookId(@PathVariable long bookId) {

        List<Hit> hits = repository.findBookId(bookId);
        return hits;
    }

}
