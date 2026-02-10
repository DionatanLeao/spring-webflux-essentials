package com.academy.devdojo.webflux.repository;

import com.academy.devdojo.webflux.domain.DevDojoUser;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Mono;

public interface DevDojoUserRepository extends ReactiveCrudRepository<DevDojoUser, Integer> {
    Mono<DevDojoUser> findByUsername(String username);
}
