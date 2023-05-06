package com.example.bankingapi.service.lowcost;

import com.example.bankingapi.domain.ClasaZbor;
import com.example.bankingapi.dto.oltp.ClasaZborDtoOLTP;
import com.example.bankingapi.repository.lowcost.ClasaZborRepositoryLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClasaZborServiceLow {

    private final ClasaZborRepositoryLow clasaZborRepositoryLow;
    private final MapperOLTP mapper;

    public List<ClasaZbor> findAll() {
        return clasaZborRepositoryLow.findAll();
    }

    public ClasaZbor add(ClasaZborDtoOLTP reqDto) {
        return clasaZborRepositoryLow.save(mapper.toEntity(reqDto));
    }

}
