package com.example.bankingapi.service;

import com.example.bankingapi.domain.Zbor;
import com.example.bankingapi.dto.ZborDto;
import com.example.bankingapi.repository.global.ZborRepository;
import com.example.bankingapi.repository.lowcost.ZborRepositoryLow;
import com.example.bankingapi.repository.nonlowcost.ZborRepositoryNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZborService {

    private final ZborRepositoryLow zborRepositoryLow;
    private final ZborRepositoryNonLow zborRepositoryNonLow;
    private final ZborRepository zborRepositoryGlobal;
    private final Mapper mapper;

    public Page<Zbor> findAllLow(PageRequest pageRequest) {
        return zborRepositoryLow.findAll(pageRequest);
    }

    public Page<Zbor> findAllNonLow(PageRequest pageRequest) {
        return zborRepositoryNonLow.findAll(pageRequest);
    }

    public Page<Zbor> findAllGlobal(PageRequest pageRequest) {
        return zborRepositoryGlobal.findAll(pageRequest);
    }

    public Zbor addLow(ZborDto reqDto) {
        return zborRepositoryLow.save(mapper.toEntity(reqDto));
    }

    public Zbor addNonLow(ZborDto reqDto) {
        return zborRepositoryNonLow.save(mapper.toEntity(reqDto));
    }

    public Zbor addGlobal(ZborDto reqDto) {
        return zborRepositoryGlobal.save(mapper.toEntity(reqDto));
    }

}
