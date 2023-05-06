package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.Zbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZborRepositoryLow extends JpaRepository<Zbor, Long> {

}
