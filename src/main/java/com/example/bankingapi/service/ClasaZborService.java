package com.example.bankingapi.service;

import com.example.bankingapi.domain.ClasaZbor;
import com.example.bankingapi.dto.ClasaZborDto;
import com.example.bankingapi.repository.global.ClasaZborRepository;
import com.example.bankingapi.repository.lowcost.ClasaZborRepositoryLow;
import com.example.bankingapi.repository.nonlowcost.ClasaZborRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClasaZborService {

    private final ClasaZborRepositoryNonLow clasaZborRepositoryNonLow;
    private final ClasaZborRepositoryLow clasaZborRepositoryLow;
    private final ClasaZborRepository clasaZborRepository;

    private final Mapper mapper;

    public List<ClasaZbor> findAllNonLow() {
        return clasaZborRepositoryNonLow.findAll();
    }

    public List<ClasaZbor> findAllLow() {
        return clasaZborRepositoryLow.findAll();
    }

    public List<ClasaZbor> findAllGlobal() {
        return clasaZborRepository.findAll();
    }

    public ClasaZbor addGlobal(ClasaZborDto reqDto) {
        return clasaZborRepository.save(mapper.toEntity(reqDto));
    }

    public ClasaZbor addLow(ClasaZborDto reqDto) {
        return clasaZborRepositoryLow.save(mapper.toEntity(reqDto));
    }

    public ClasaZbor addNonLow(ClasaZborDto reqDto) {
        return clasaZborRepositoryNonLow.save(mapper.toEntity(reqDto));
    }

}
