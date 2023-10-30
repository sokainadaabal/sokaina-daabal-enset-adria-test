package org.sid.transfersservice.web;

import org.sid.transfersservice.repositories.TransfersRepository;
import org.sid.transfersservice.services.ClientRestClientService;
import org.sid.transfersservice.services.WalletRestClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransfersRestController {

    @Autowired
    private TransfersRepository transfersRepository;
    @Autowired
    private ClientRestClientService clientRestClientService;

    @Autowired
    private WalletRestClientService walletRestClientService;


}
