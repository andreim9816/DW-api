package com.example.bankingapi.repository.oltp;

import com.example.bankingapi.domain.oltp.Destinatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinatieRepositoryOLTP extends JpaRepository<Destinatie, Long> {

}
