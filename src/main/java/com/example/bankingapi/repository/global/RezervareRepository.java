package com.example.bankingapi.repository.global;

import com.example.bankingapi.domain.Rezervare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervareRepository extends JpaRepository<Rezervare, Long> {

}
