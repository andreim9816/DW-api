package com.example.bankingapi.repository.warehouse;

import com.example.bankingapi.domain.warehouse.Destinatie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DestinatieRepositoryWH extends JpaRepository<Destinatie, String> {

}
