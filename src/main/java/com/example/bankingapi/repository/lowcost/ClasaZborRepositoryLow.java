package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.ClasaZbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasaZborRepositoryLow extends JpaRepository<ClasaZbor, Long> {
}
