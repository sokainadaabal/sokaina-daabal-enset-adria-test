package org.sid.walletservice;

import org.sid.walletservice.entities.Client;
import org.sid.walletservice.entities.Wallet;
import org.sid.walletservice.repositories.ClientRepository;
import org.sid.walletservice.repositories.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@SpringBootApplication
public class WalletServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WalletServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(RepositoryRestConfiguration restConfiguration, ClientRepository clientRepository, WalletRepository walletRepository){
        restConfiguration.exposeIdsFor(Client.class);
        restConfiguration.exposeIdsFor(Wallet.class);
        return args -> {
            clientRepository.saveAll(List.of(
                    Client.builder().name("sokaina").email("sokaina@gmail.com").build(),
                    Client.builder().name("rachida").email("rachida@gmail.com").build(),
                    Client.builder().name("siham").email("siham@gmail.com").build()
                    ));

            clientRepository.findAll().forEach(client->{
                walletRepository.save(Wallet.builder().id(UUID.randomUUID()).solde(1292+Math.random()).devis("DH").createdAt(new Date()).clientId(client.getId()).client(client).build());
            });
        };
    }
}
