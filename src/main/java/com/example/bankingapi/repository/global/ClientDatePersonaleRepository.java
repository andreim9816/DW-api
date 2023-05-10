package com.example.bankingapi.repository.global;

import com.example.bankingapi.domain.ClientGDPR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDatePersonaleRepository extends JpaRepository<ClientGDPR, Long> {
}
