package com.example.bankingapi.repository.global;

import com.example.bankingapi.domain.Stat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatRepository extends JpaRepository<Stat, String> {

}
