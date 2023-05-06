package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.Zbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZborRepositoryNonLow extends JpaRepository<Zbor, Long> {

}
