package com.example.bankingapi.service.warehouse;

import com.example.bankingapi.domain.warehouse.Destinatie;
import com.example.bankingapi.dto.oltp.DestinatieDtoOLTP;
import com.example.bankingapi.repository.warehouse.DestinatieRepositoryWH;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DestinatieServiceWH {

    private final DestinatieRepositoryWH repositoryWH;
    private final MapperWH mapper;

    public List<Destinatie> findAll() {
        return repositoryWH.findAll();
    }

}
