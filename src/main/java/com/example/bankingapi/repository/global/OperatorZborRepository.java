package com.example.bankingapi.repository.global;

import com.example.bankingapi.domain.OperatorZbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperatorZborRepository extends JpaRepository<OperatorZbor, String> {
}
