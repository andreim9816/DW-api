package com.example.bankingapi.service.oltp;

import com.example.bankingapi.domain.oltp.OperatorZbor;
import com.example.bankingapi.dto.oltp.OperatorZborDtoOLTP;
import com.example.bankingapi.repository.oltp.OperatorZborRepositoryOLTP;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OperatorZborServiceOLTP {

    private final OperatorZborRepositoryOLTP repositoryOLTP;
    private final MapperOLTP mapper;

    public List<OperatorZbor> findAll() {
        return repositoryOLTP.findAll();
    }

    public OperatorZbor add(OperatorZborDtoOLTP reqDto) {
        return repositoryOLTP.save(mapper.toEntity(reqDto));
    }

}
