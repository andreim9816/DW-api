package com.example.bankingapi.service;

import com.example.bankingapi.domain.OperatorZbor;
import com.example.bankingapi.dto.OperatorZborDto;
import com.example.bankingapi.repository.global.OperatorZborRepository;
import com.example.bankingapi.repository.lowcost.OperatorZborRepositoryLow;
import com.example.bankingapi.repository.nonlowcost.OperatorZborRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatorZborService {

    private final OperatorZborRepositoryLow operatorZborRepositoryLow;
    private final OperatorZborRepositoryNonLow operatorZborRepositoryNonLow;
    private final OperatorZborRepository operatorZborRepositoryGlobal;
    private final Mapper mapper;

    public List<OperatorZbor> findAllLow() {
        return operatorZborRepositoryLow.findAll();
    }

    public List<OperatorZbor> findAllNonLow() {
        return operatorZborRepositoryNonLow.findAll();
    }

    public List<OperatorZbor> findAllGlobal() {
        return operatorZborRepositoryGlobal.findAll();
    }

    public OperatorZbor addLow(OperatorZborDto reqDto) {
        return operatorZborRepositoryLow.save(mapper.toEntity(reqDto));
    }

    public OperatorZbor addNonLow(OperatorZborDto reqDto) {
        return operatorZborRepositoryNonLow.save(mapper.toEntity(reqDto));
    }

    public OperatorZbor addGlobal(OperatorZborDto reqDto) {
        return operatorZborRepositoryGlobal.save(mapper.toEntity(reqDto));
    }

}
