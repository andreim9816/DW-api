package com.example.bankingapi.repository.oltp;

import com.example.bankingapi.domain.oltp.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepositoryOLTP extends JpaRepository<Client, Long> {
}
