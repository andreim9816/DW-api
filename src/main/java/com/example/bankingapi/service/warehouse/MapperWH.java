package com.example.bankingapi.service.warehouse;

import com.example.bankingapi.domain.warehouse.ClasaZborWH;
import com.example.bankingapi.dto.warehouse.ClasaZborDtoWH;
import org.springframework.stereotype.Component;

@Component
public class MapperWH {

    public ClasaZborWH toEntity(ClasaZborDtoWH dto) {
        return ClasaZborWH.builder()
                .denumire(dto.getDenumire())
                .build();
    }

    public ClasaZborDtoWH toDto(ClasaZborWH entity) {
        return ClasaZborDtoWH.builder()
                .id(entity.getId())
                .denumire(entity.getDenumire())
                .build();
    }

}
