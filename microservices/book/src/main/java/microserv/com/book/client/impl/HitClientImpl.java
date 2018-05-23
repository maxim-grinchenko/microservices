/*
package microserv.com.book.client.impl;

import microserv.com.book.client.LoggingClient;
import microserv.com.book.domain.Hit;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class HitClientImpl implements LoggingClient {
   */
/* @Value("${logging.url}")
    private String loggingUrl;*//*


    private final RestTemplate restTemplate;

    @Override
    public List<Hit> getHitsByBookId(long bookId) {
        Hit[] hits = restTemplate.getForObject("http://hit/hit/get/by/book/id/" + bookId, Hit[].class);
        return Arrays.asList(hits);
    }
}*/
