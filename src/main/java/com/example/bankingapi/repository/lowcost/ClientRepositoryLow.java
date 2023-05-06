package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoryLow extends JpaRepository<Client, Long> {
}
