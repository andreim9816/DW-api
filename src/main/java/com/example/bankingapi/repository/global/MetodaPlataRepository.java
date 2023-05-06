package com.example.bankingapi.repository.global;

import com.example.bankingapi.domain.MetodaPlata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodaPlataRepository extends JpaRepository<MetodaPlata, Long> {

}
