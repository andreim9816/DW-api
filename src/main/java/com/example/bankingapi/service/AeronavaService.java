package com.example.bankingapi.service;

import com.example.bankingapi.domain.Aeronava;
import com.example.bankingapi.dto.AeronavaDto;
import com.example.bankingapi.repository.global.AeronavaRepository;
import com.example.bankingapi.repository.lowcost.AeronavaRepositoryLow;
import com.example.bankingapi.repository.nonlowcost.AeronavaRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AeronavaService {

    private final AeronavaRepositoryLow repositoryLow;
    private final AeronavaRepository repositoryGlobal;
    private final AeronavaRepositoryNonLow repositoryNonLow;
    private final Mapper mapper;

    public List<Aeronava> findAllGlobal() {
        return repositoryGlobal.findAll();
    }

    public List<Aeronava> findAllLow() {
        return repositoryLow.findAll();
    }

    public List<Aeronava> findAllNonLow() {
        return repositoryNonLow.findAll();
    }

    public Aeronava addLow(AeronavaDto reqDto) {
        return repositoryLow.save(mapper.toEntity(reqDto));
    }

    public Aeronava addNonLow(AeronavaDto reqDto) {
        return repositoryNonLow.save(mapper.toEntity(reqDto));
    }

    public Aeronava addGlobal(AeronavaDto reqDto) {
        return repositoryGlobal.save(mapper.toEntity(reqDto));
    }


}
