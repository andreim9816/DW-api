package com.example.bankingapi.repository.oltp;

import com.example.bankingapi.domain.oltp.Zbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZborRepositoryOLTP extends JpaRepository<Zbor, Long> {

}
