package com.example.bankingapi.service;

import com.example.bankingapi.domain.Stat;
import com.example.bankingapi.dto.StatDto;
import com.example.bankingapi.repository.global.StatRepository;
import com.example.bankingapi.repository.lowcost.StatRepositoryLow;
import com.example.bankingapi.repository.nonlowcost.StatRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StatService {

    private final StatRepositoryLow statRepositoryLow;
    private final StatRepositoryNonLow statRepositoryNonLow;
    private final StatRepository statRepositoryGlobal;
    private final Mapper mapper;

    public List<Stat> findAllLow() {
        return statRepositoryLow.findAll();
    }

    public List<Stat> findAllNonLow() {
        return statRepositoryNonLow.findAll();
    }

    public List<Stat> findAllGlobal() {
        return statRepositoryGlobal.findAll();
    }

    public Stat addLow(StatDto reqDto) {
        return statRepositoryLow.save(mapper.toEntity(reqDto));
    }

    public Stat addNonLow(StatDto reqDto) {
        return statRepositoryNonLow.save(mapper.toEntity(reqDto));
    }

    public Stat addGlobal(StatDto reqDto) {
        return statRepositoryGlobal.save(mapper.toEntity(reqDto));
    }

}
