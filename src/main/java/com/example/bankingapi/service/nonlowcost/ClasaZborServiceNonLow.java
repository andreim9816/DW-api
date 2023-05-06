package com.example.bankingapi.service.nonlowcost;

import com.example.bankingapi.domain.ClasaZbor;
import com.example.bankingapi.repository.nonlowcost.ClasaZborRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClasaZborServiceNonLow {

    private final ClasaZborRepositoryNonLow repositoryWH;
    private final MapperWH mapper;

    public List<ClasaZbor> findAll() {
        return repositoryWH.findAll();
    }

}
