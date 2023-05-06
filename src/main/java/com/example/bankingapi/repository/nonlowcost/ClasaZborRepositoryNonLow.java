package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.ClasaZbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasaZborRepositoryNonLow extends JpaRepository<ClasaZbor, Long> {

}
