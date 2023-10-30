package org.sid.transfersservice.models;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class Wallet {
    private UUID id;
    private double solde;
    private Date createdAt;

    private String devis;

    private Long clientId;
}
