package com.academy.devdojo.webflux.repository;

import com.academy.devdojo.webflux.domain.Anime;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface AnimeRepository extends ReactiveCrudRepository<Anime, Integer > {
}
