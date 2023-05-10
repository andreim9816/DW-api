package com.example.bankingapi.service;

import com.example.bankingapi.domain.Plata;
import com.example.bankingapi.dto.PlataDto;
import com.example.bankingapi.repository.global.PlataRepository;
import com.example.bankingapi.repository.lowcost.PlataRepositoryLow;
import com.example.bankingapi.repository.nonlowcost.PlataRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlataService {

    private final PlataRepositoryLow plataRepositoryLow;
    private final PlataRepositoryNonLow plataRepositoryNonLow;
    private final PlataRepository plataRepositoryGlobal;
    private final Mapper mapper;

    public Page<Plata> findAllLow(PageRequest pageRequest) {
        return plataRepositoryLow.findAll(pageRequest);
    }

    public Page<Plata> findAllNonLow(PageRequest pageRequest) {
        return plataRepositoryNonLow.findAll(pageRequest);
    }

    public Page<Plata> findAllGlobal(PageRequest pageRequest) {
        return plataRepositoryGlobal.findAll(pageRequest);
    }

    public Plata addLow(PlataDto reqDto) {
        return plataRepositoryLow.save(mapper.toEntity(reqDto));
    }

    public Plata addNonLow(PlataDto reqDto) {
        return plataRepositoryNonLow.save(mapper.toEntity(reqDto));
    }

    public Plata addGlobal(PlataDto reqDto) {
        return plataRepositoryGlobal.save(mapper.toEntity(reqDto));
    }

}
