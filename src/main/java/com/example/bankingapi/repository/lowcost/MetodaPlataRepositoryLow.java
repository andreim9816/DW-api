package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.MetodaPlata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodaPlataRepositoryLow extends JpaRepository<MetodaPlata, Long> {

}
