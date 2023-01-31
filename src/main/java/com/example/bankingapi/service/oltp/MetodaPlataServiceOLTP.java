package com.example.bankingapi.service.oltp;

import com.example.bankingapi.domain.oltp.MetodaPlata;
import com.example.bankingapi.dto.oltp.MetodaPlataDtoOLTP;
import com.example.bankingapi.repository.oltp.MetodaPlataRepositoryOLTP;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetodaPlataServiceOLTP {

    private final MetodaPlataRepositoryOLTP repositoryOLTP;
    private final MapperOLTP mapper;

    public List<MetodaPlata> findAll() {
        return repositoryOLTP.findAll();
    }

    public MetodaPlata add(MetodaPlataDtoOLTP reqDto) {
        return repositoryOLTP.save(mapper.toEntity(reqDto));
    }

}
