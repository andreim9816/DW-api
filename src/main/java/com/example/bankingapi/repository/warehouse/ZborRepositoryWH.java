package com.example.bankingapi.repository.warehouse;

import com.example.bankingapi.domain.warehouse.ZborWH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZborRepositoryWH extends JpaRepository<ZborWH, Long> {

}
