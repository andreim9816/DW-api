package com.example.bankingapi.repository.oltp;

import com.example.bankingapi.domain.oltp.Rezervare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervareRepositoryOLTP extends JpaRepository<Rezervare, Long> {

}
