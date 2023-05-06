package com.example.bankingapi.repository.global;

import com.example.bankingapi.domain.Plata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlataRepository extends JpaRepository<Plata, Long> {

}
