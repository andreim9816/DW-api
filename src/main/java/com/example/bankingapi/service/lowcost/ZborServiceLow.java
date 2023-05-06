package com.example.bankingapi.service.lowcost;

import com.example.bankingapi.domain.Zbor;
import com.example.bankingapi.dto.oltp.ZborDtoOLTP;
import com.example.bankingapi.repository.lowcost.ZborRepositoryLow;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZborServiceLow {

    private final ZborRepositoryLow zborRepositoryLow;
    private final MapperOLTP mapper;

    public Page<Zbor> findAll(Pageable pageable) {
        return zborRepositoryLow.findAll(pageable);
    }

    public Zbor add(ZborDtoOLTP reqDto) {
        return zborRepositoryLow.save(mapper.toEntity(reqDto));
    }

}
