package com.example.bankingapi.repository.global;

import com.example.bankingapi.domain.Destinatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinatieRepository extends JpaRepository<Destinatie, String> {

}
