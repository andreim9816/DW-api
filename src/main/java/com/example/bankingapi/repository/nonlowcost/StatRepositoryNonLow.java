package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.Stat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepositoryNonLow extends JpaRepository<Stat, String> {

}
