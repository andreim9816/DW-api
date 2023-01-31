package com.example.bankingapi.repository.warehouse;

import com.example.bankingapi.domain.warehouse.MetodaPlata;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MetodaPlataRepositoryWH extends JpaRepository<MetodaPlata, Long> {

}
