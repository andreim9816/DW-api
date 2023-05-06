package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoryNonLow extends JpaRepository<Client, Long> {
}