package org.sid.transfersservice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.sid.transfersservice.enums.EtatTransfer;
import org.sid.transfersservice.models.Wallet;

import java.util.Date;
import java.util.UUID;


@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transfers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date createdAt;
    private UUID walletSourceId;
    private UUID getWalletDestinationId;

    @Transient
    private Wallet walletSource;
    @Transient
    private Wallet walletDestiation;
    private double montant;

    private EtatTransfer etat;
}
