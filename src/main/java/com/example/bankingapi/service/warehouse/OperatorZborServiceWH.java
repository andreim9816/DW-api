package com.example.bankingapi.service.warehouse;

import com.example.bankingapi.domain.warehouse.OperatorZbor;
import com.example.bankingapi.repository.warehouse.OperatorZborRepositoryWH;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatorZborServiceWH {

    private final OperatorZborRepositoryWH repositoryWH;
    private final MapperWH mapper;

    public List<OperatorZbor> findAll() {
        return repositoryWH.findAll();
    }

}
