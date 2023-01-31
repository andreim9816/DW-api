package com.example.bankingapi.repository.warehouse;

import com.example.bankingapi.domain.warehouse.OperatorZbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorZborRepositoryWH extends JpaRepository<OperatorZbor, String> {
}
