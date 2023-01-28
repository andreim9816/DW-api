package com.example.bankingapi.service.oltp;

import com.example.bankingapi.domain.oltp.ClasaZborOLTP;
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

    public List<ClasaZborOLTP> findAll() {
        return clasaZborRepository.findAll();
    }

    public ClasaZborOLTP add(ClasaZborDtoOLTP reqDto) {
        return clasaZborRepository.save(mapper.toEntity(reqDto));
    }

}
