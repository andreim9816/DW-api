package com.example.bankingapi.repository.oltp;

import com.example.bankingapi.domain.oltp.OperatorZbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorZborRepositoryOLTP extends JpaRepository<OperatorZbor, String> {
}
