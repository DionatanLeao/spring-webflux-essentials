package com.academy.devdojo.webflux.service;

import com.academy.devdojo.webflux.domain.Anime;
import com.academy.devdojo.webflux.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@RequiredArgsConstructor
public class AnimeService {
    private final AnimeRepository animeRepository;

    public Flux<Anime> findAll() {
        return animeRepository.findAll();
    }
}
