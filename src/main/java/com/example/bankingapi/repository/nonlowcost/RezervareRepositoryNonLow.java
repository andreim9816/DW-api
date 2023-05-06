package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.Rezervare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervareRepositoryNonLow extends JpaRepository<Rezervare, Long> {

}
