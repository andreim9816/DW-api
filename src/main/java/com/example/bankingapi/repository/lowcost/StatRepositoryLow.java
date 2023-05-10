package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.Stat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepositoryLow extends JpaRepository<Stat, String> {

}
