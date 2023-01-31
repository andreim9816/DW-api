package com.example.bankingapi.repository.warehouse;

import com.example.bankingapi.domain.warehouse.TimpWH;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface TimpRepositoryWH extends JpaRepository<TimpWH, Date> {

}
