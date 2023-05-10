package com.example.bankingapi.service;

import com.example.bankingapi.domain.MetodaPlata;
import com.example.bankingapi.dto.MetodaPlataDto;
import com.example.bankingapi.repository.global.MetodaPlataRepository;
import com.example.bankingapi.repository.lowcost.MetodaPlataRepositoryLow;
import com.example.bankingapi.repository.nonlowcost.MetodaPlataRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetodaPlataService {

    private final MetodaPlataRepositoryLow metodaPlataRepositoryLow;
    private final MetodaPlataRepositoryNonLow metodaPlataRepositoryNonLow;
    private final MetodaPlataRepository metodaPlataRepositoryGlobal;
    private final Mapper mapper;

    public List<MetodaPlata> findAllLow() {
        return metodaPlataRepositoryLow.findAll();
    }

    public List<MetodaPlata> findAllNonLow() {
        return metodaPlataRepositoryNonLow.findAll();
    }

    public List<MetodaPlata> findAllGlobal() {
        return metodaPlataRepositoryGlobal.findAll();
    }

    public MetodaPlata addLow(MetodaPlataDto reqDto) {
        return metodaPlataRepositoryLow.save(mapper.toEntity(reqDto));
    }

    public MetodaPlata addNonLow(MetodaPlataDto reqDto) {
        return metodaPlataRepositoryNonLow.save(mapper.toEntity(reqDto));
    }

    public MetodaPlata addGlobal(MetodaPlataDto reqDto) {
        return metodaPlataRepositoryGlobal.save(mapper.toEntity(reqDto));
    }

}
