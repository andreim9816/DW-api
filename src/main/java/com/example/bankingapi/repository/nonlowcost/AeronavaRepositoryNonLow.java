package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.Aeronava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AeronavaRepositoryNonLow extends JpaRepository<Aeronava, Long> {

}