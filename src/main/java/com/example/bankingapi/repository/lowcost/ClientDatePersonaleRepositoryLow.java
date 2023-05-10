package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.ClientGDPR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDatePersonaleRepositoryLow extends JpaRepository<ClientGDPR, Long> {
}
