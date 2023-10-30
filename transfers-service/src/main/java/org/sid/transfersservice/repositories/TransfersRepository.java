package org.sid.transfersservice.repositories;

import org.sid.transfersservice.entities.Transfers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransfersRepository extends JpaRepository<Transfers,Long> {
}
