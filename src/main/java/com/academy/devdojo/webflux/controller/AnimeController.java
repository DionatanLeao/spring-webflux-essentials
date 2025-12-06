package com.academy.devdojo.webflux.controller;

import com.academy.devdojo.webflux.domain.Anime;
import com.academy.devdojo.webflux.repository.AnimeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RequiredArgsConstructor
@RestController
@RequestMapping("/animes")
@Slf4j
public class AnimeController {
    private final AnimeRepository animeRepository;

    @GetMapping
    public Flux<Anime> listAll() {
        return animeRepository.findAll();
    }

}
