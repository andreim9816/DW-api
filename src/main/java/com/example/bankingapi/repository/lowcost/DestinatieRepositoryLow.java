package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.Destinatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinatieRepositoryLow extends JpaRepository<Destinatie, String> {

}
