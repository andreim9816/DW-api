package com.example.bankingapi.service.nonlowcost;

import com.example.bankingapi.domain.MetodaPlata;
import com.example.bankingapi.repository.nonlowcost.MetodaPlataRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetodaPlataServiceNonLow {

    private final MetodaPlataRepositoryNonLow repositoryWH;
    private final MapperWH mapper;

    public List<MetodaPlata> findAll() {
        return repositoryWH.findAll();
    }

}
