package com.example.bankingapi.repository.oltp;

import com.example.bankingapi.domain.oltp.ClasaZborOLTP;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasaZborRepositoryOLTP extends JpaRepository<ClasaZborOLTP, Long> {

}
