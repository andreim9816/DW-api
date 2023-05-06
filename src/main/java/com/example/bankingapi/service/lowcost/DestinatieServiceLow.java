package com.example.bankingapi.service.lowcost;

import com.example.bankingapi.domain.Destinatie;
import com.example.bankingapi.dto.oltp.DestinatieDtoOLTP;
import com.example.bankingapi.repository.lowcost.DestinatieRepositoryLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DestinatieServiceLow {

    private final DestinatieRepositoryLow repositoryOLTP;
    private final MapperOLTP mapper;

    public List<Destinatie> findAll() {
        return repositoryOLTP.findAll();
    }

    public Destinatie add(DestinatieDtoOLTP reqDto) {
        return repositoryOLTP.save(mapper.toEntity(reqDto));
    }

}
