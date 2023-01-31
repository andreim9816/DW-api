package com.example.bankingapi.service.warehouse;

import com.example.bankingapi.domain.warehouse.ClasaZbor;
import com.example.bankingapi.dto.oltp.ClasaZborDtoOLTP;
import com.example.bankingapi.repository.warehouse.ClasaZborRepositoryWH;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClasaZborServiceWH {

    private final ClasaZborRepositoryWH repositoryWH;
    private final MapperWH mapper;

    public List<ClasaZbor> findAll() {
        return repositoryWH.findAll();
    }

}
