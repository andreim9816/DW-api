package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.Destinatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinatieRepositoryNonLow extends JpaRepository<Destinatie, String> {

}
