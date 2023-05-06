package com.example.bankingapi.service.lowcost;

import com.example.bankingapi.domain.MetodaPlata;
import com.example.bankingapi.dto.oltp.MetodaPlataDtoOLTP;
import com.example.bankingapi.repository.lowcost.MetodaPlataRepositoryLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MetodaPlataServiceLow {

    private final MetodaPlataRepositoryLow repositoryOLTP;
    private final MapperOLTP mapper;

    public List<MetodaPlata> findAll() {
        return repositoryOLTP.findAll();
    }

    public MetodaPlata add(MetodaPlataDtoOLTP reqDto) {
        return repositoryOLTP.save(mapper.toEntity(reqDto));
    }

}
