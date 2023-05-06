package com.example.bankingapi.repository.lowcost;

import com.example.bankingapi.domain.OperatorZbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorZborRepositoryLow extends JpaRepository<OperatorZbor, String> {
}
