package com.example.bankingapi.service.warehouse;

import com.example.bankingapi.domain.warehouse.MetodaPlata;
import com.example.bankingapi.dto.oltp.MetodaPlataDtoOLTP;
import com.example.bankingapi.repository.warehouse.MetodaPlataRepositoryWH;
import com.example.bankingapi.service.oltp.MapperOLTP;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetodaPlataServiceWH {

    private final MetodaPlataRepositoryWH repositoryWH;
    private final MapperWH mapper;

    public List<MetodaPlata> findAll() {
        return repositoryWH.findAll();
    }

}
