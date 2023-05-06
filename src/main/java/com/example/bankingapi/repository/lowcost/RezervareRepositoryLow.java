package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.Rezervare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervareRepositoryLow extends JpaRepository<Rezervare, Long> {

}
