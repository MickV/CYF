package com.cyf.cyfback;

import com.cyf.cyfback.model.User;
import com.cyf.cyfback.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(UserRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new User("Mick", "adm")));
            log.info("Preloading " + repository.save(new User("zak", "esclave")));
        };
    }
}