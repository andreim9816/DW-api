package com.example.bankingapi.repository.global;

import com.example.bankingapi.domain.Zbor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZborRepository extends JpaRepository<Zbor, Long> {

}
