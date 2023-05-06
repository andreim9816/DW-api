package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.Plata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataRepositoryLow extends JpaRepository<Plata, Long> {

}
