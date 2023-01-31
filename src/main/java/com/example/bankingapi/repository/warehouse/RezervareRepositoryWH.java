package com.example.bankingapi.repository.warehouse;

import com.example.bankingapi.domain.warehouse.RezervareId;
import com.example.bankingapi.domain.warehouse.RezervareWH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RezervareRepositoryWH extends JpaRepository<RezervareWH, RezervareId> {

}
