package com.example.bankingapi.repository.warehouse;

import com.example.bankingapi.domain.warehouse.ClasaZbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasaZborRepositoryWH extends JpaRepository<ClasaZbor, Long> {

}
