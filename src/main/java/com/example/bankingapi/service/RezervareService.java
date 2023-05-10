package com.example.bankingapi.service;

import com.example.bankingapi.domain.Rezervare;
import com.example.bankingapi.dto.RezervareDto;
import com.example.bankingapi.repository.global.RezervareRepository;
import com.example.bankingapi.repository.lowcost.RezervareRepositoryLow;
import com.example.bankingapi.repository.nonlowcost.RezervareRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RezervareService {

    private final RezervareRepositoryLow rezervareRepositoryLow;
    private final RezervareRepositoryNonLow rezervareRepositoryNonLow;
    private final RezervareRepository rezervareRepositoryGlobal;
    private final Mapper mapper;

    public Page<Rezervare> findAllLow(PageRequest pageRequest) {
        return rezervareRepositoryLow.findAll(pageRequest);
    }

    public Page<Rezervare> findAllNonLow(PageRequest pageRequest) {
        return rezervareRepositoryNonLow.findAll(pageRequest);
    }

    public Page<Rezervare> findAllGlobal(PageRequest pageRequest) {
        return rezervareRepositoryGlobal.findAll(pageRequest);
    }

    public Rezervare addLow(RezervareDto reqDto) {
        return rezervareRepositoryLow.save(mapper.toEntity(reqDto));
    }

    public Rezervare addNonLow(RezervareDto reqDto) {
        return rezervareRepositoryNonLow.save(mapper.toEntity(reqDto));
    }

    public Rezervare addGlobal(RezervareDto reqDto) {
        return rezervareRepositoryGlobal.save(mapper.toEntity(reqDto));
    }

}
