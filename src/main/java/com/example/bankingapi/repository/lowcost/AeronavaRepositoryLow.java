package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.Aeronava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AeronavaRepositoryLow extends JpaRepository<Aeronava, Long> {

}
