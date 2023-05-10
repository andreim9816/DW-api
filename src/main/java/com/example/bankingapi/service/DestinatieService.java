package com.example.bankingapi.service;

import com.example.bankingapi.domain.Destinatie;
import com.example.bankingapi.dto.DestinatieDto;
import com.example.bankingapi.repository.global.DestinatieRepository;
import com.example.bankingapi.repository.lowcost.DestinatieRepositoryLow;
import com.example.bankingapi.repository.nonlowcost.DestinatieRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DestinatieService {

    private final DestinatieRepositoryLow destinatieRepositoryLow;
    private final DestinatieRepositoryNonLow destinatieRepositoryNonLow;
    private final DestinatieRepository destinatieRepositoryGlobal;
    private final Mapper mapper;

    public List<Destinatie> findAllLow() {
        return destinatieRepositoryLow.findAll();
    }

    public List<Destinatie> findAllNonLow() {
        return destinatieRepositoryNonLow.findAll();
    }

    public List<Destinatie> findAllGlobal() {
        return destinatieRepositoryGlobal.findAll();
    }

    public Destinatie addLow(DestinatieDto reqDto) {
        return destinatieRepositoryLow.save(mapper.toEntity(reqDto));
    }

    public Destinatie addNonLow(DestinatieDto reqDto) {
        return destinatieRepositoryNonLow.save(mapper.toEntity(reqDto));
    }

    public Destinatie addGlobal(DestinatieDto reqDto) {
        return destinatieRepositoryGlobal.save(mapper.toEntity(reqDto));
    }

}
