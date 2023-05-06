package com.example.bankingapi.service.nonlowcost;

import com.example.bankingapi.domain.Destinatie;
import com.example.bankingapi.repository.nonlowcost.DestinatieRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DestinatieServiceNonLow {

    private final DestinatieRepositoryNonLow repositoryWH;
    private final MapperWH mapper;

    public List<Destinatie> findAll() {
        return repositoryWH.findAll();
    }

}
