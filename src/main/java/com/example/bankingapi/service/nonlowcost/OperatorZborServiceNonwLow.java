package com.example.bankingapi.service.nonlowcost;

import com.example.bankingapi.domain.OperatorZbor;
import com.example.bankingapi.repository.nonlowcost.OperatorZborRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatorZborServiceNonwLow {

    private final OperatorZborRepositoryNonLow repositoryWH;
    private final MapperWH mapper;

    public List<OperatorZbor> findAll() {
        return repositoryWH.findAll();
    }

}
