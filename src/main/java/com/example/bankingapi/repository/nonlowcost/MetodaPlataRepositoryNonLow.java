package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.MetodaPlata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodaPlataRepositoryNonLow extends JpaRepository<MetodaPlata, Long> {

}
