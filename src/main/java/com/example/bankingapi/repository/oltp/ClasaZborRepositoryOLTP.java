package com.example.bankingapi.repository.oltp;

import com.example.bankingapi.domain.oltp.ClasaZbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasaZborRepositoryOLTP extends JpaRepository<ClasaZbor, Long> {

}
