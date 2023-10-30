package org.sid.transfersservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TransfersServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransfersServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(){
        return args -> {};
    }

}
