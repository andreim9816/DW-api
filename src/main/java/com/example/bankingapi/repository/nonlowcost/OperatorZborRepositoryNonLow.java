package com.example.bankingapi.repository.nonlowcost;

import com.example.bankingapi.domain.OperatorZbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorZborRepositoryNonLow extends JpaRepository<OperatorZbor, String> {
}
