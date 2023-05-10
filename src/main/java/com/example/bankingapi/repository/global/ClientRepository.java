package com.example.bankingapi.repository.global;

import com.example.bankingapi.domain.ClientNonGDPR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientNonGDPR, Long> {
}
