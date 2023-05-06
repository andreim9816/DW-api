package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.Plata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataRepositoryNonLow extends JpaRepository<Plata, Long> {

}
