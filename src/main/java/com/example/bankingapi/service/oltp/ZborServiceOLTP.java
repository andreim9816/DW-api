package com.example.bankingapi.service.oltp;

import com.example.bankingapi.domain.oltp.Zbor;
import com.example.bankingapi.dto.oltp.ZborDtoOLTP;
import com.example.bankingapi.repository.oltp.ZborRepositoryOLTP;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ZborServiceOLTP {

    private final ZborRepositoryOLTP zborRepositoryOLTP;
    private final MapperOLTP mapper;

    public Page<Zbor> findAll(Pageable pageable) {
        return zborRepositoryOLTP.findAll(pageable);
    }

    public Zbor add(ZborDtoOLTP reqDto) {
        return zborRepositoryOLTP.save(mapper.toEntity(reqDto));
    }

}
