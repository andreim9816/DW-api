package com.example.bankingapi.service.oltp;

import com.example.bankingapi.domain.oltp.ClasaZbor;
import com.example.bankingapi.dto.oltp.ClasaZborDtoOLTP;
import com.example.bankingapi.repository.oltp.ClasaZborRepositoryOLTP;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClasaZborServiceOLTP {

    private final ClasaZborRepositoryOLTP clasaZborRepository;
    private final MapperOLTP mapper;

    public List<ClasaZbor> findAll() {
        return clasaZborRepository.findAll();
    }

    public ClasaZbor add(ClasaZborDtoOLTP reqDto) {
        return clasaZborRepository.save(mapper.toEntity(reqDto));
    }

}
