package org.sid.transfersservice;

import org.sid.transfersservice.entities.Transfers;
import org.sid.transfersservice.models.Wallet;
import org.sid.transfersservice.repositories.TransfersRepository;
import org.sid.transfersservice.services.WalletRestClientService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.hateoas.PagedModel;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class TransfersServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransfersServiceApplication.class, args);
    }


    @Bean
    CommandLineRunner start(WalletRestClientService walletRestClientService, TransfersRepository transfersRepository){
        return args -> {

        };
    }

}
