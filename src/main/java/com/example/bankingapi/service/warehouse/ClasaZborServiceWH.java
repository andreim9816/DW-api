package com.example.bankingapi.service.warehouse;

import com.example.bankingapi.domain.warehouse.ClasaZborWH;
import com.example.bankingapi.dto.warehouse.ClasaZborDtoWH;
import com.example.bankingapi.repository.warehouse.ClasaZborRepositoryWH;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClasaZborServiceWH {

    private final ClasaZborRepositoryWH clasaZborRepository;
    private final MapperWH mapper;

    public List<ClasaZborWH> findAll() {
        return clasaZborRepository.findAll();
    }

    public ClasaZborWH add(ClasaZborDtoWH reqDto) {
        return clasaZborRepository.save(mapper.toEntity(reqDto));
    }

}
