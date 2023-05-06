package com.example.bankingapi.service.lowcost;

import com.example.bankingapi.domain.OperatorZbor;
import com.example.bankingapi.dto.oltp.OperatorZborDtoOLTP;
import com.example.bankingapi.repository.lowcost.OperatorZborRepositoryLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatorZborServiceLow {

    private final OperatorZborRepositoryLow repositoryOLTP;
    private final MapperOLTP mapper;

    public List<OperatorZbor> findAll() {
        return repositoryOLTP.findAll();
    }

    public OperatorZbor add(OperatorZborDtoOLTP reqDto) {
        return repositoryOLTP.save(mapper.toEntity(reqDto));
    }

}
