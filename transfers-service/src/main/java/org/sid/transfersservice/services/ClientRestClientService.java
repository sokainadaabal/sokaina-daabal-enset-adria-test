package org.sid.transfersservice.services;

import lombok.Data;
import org.sid.transfersservice.models.Client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("wallet-service")
public interface ClientRestClientService {
    @GetMapping("/client/{id}")
    public Client clientById(@PathVariable Long id);

    @GetMapping("/clients")
    public PagedModel<Client> allClient();

}
