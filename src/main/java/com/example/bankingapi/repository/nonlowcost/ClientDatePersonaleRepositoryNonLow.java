package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.ClientDatePersonale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDatePersonaleRepositoryNonLow extends JpaRepository<ClientDatePersonale, Long> {
}