package com.academy.devdojo.webflux.service;

import com.academy.devdojo.webflux.repository.DevDojoUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.ReactiveUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class DevDojoUserDetailsService implements ReactiveUserDetailsService {
    private final DevDojoUserRepository repository;
    @Override
    public Mono<UserDetails> findByUsername(String username) {
        return repository.findByUsername(username)
                .cast(UserDetails.class);
    }
}
