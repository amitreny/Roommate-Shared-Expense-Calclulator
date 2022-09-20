package com.example.demo.sharedexp;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ShareConfig {

    @Bean
    CommandLineRunner commandLineRunner(ShareRepository repository) {
        return args -> {
            Share rent = new Share(
                    "Rent",
                    20000,
                    0
            );

            Share water = new Share(
                    "Water",
                    20000,
                    0
            );

            repository.saveAll(
                    List.of(rent,water)
            );
        };
    }
}
