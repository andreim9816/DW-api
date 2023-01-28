package com.example.bankingapi.service.oltp;

import com.example.bankingapi.domain.oltp.Destinatie;
import com.example.bankingapi.domain.oltp.MetodaPlata;
import com.example.bankingapi.dto.oltp.DestinatieDtoOLTP;
import com.example.bankingapi.dto.oltp.MetodaPlataDtoOLTP;
import com.example.bankingapi.repository.oltp.DestinatieRepositoryOLTP;
import com.example.bankingapi.repository.oltp.MetodaPlataRepositoryOLTP;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DestinatieServiceOLTP {

    private final DestinatieRepositoryOLTP repositoryOLTP;
    private final MapperOLTP mapper;

    public List<Destinatie> findAll() {
        return repositoryOLTP.findAll();
    }

    public Destinatie add(DestinatieDtoOLTP reqDto) {
        return repositoryOLTP.save(mapper.toEntity(reqDto));
    }

}
