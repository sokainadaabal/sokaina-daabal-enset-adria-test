package org.sid.transfersservice.services;

import org.sid.transfersservice.models.Client;
import org.sid.transfersservice.models.Wallet;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("wallet-service")
public interface WalletRestClientService {

    @GetMapping("/wallets")
    public PagedModel<Wallet> allWallet();
}
