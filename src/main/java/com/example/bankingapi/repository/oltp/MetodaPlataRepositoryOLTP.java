package com.example.bankingapi.repository.oltp;

import com.example.bankingapi.domain.oltp.MetodaPlata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodaPlataRepositoryOLTP extends JpaRepository<MetodaPlata, Long> {

}
