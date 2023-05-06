package com.example.bankingapi.repository.global;

import com.example.bankingapi.domain.ClasaZbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasaZborRepository extends JpaRepository<ClasaZbor, Long> {

}
