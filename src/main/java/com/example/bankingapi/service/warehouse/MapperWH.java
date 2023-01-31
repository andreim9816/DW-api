package com.example.bankingapi.service.warehouse;

import com.example.bankingapi.domain.warehouse.*;
import com.example.bankingapi.dto.oltp.ClasaZborDtoOLTP;
import com.example.bankingapi.dto.oltp.DestinatieDtoOLTP;
import com.example.bankingapi.dto.oltp.MetodaPlataDtoOLTP;
import com.example.bankingapi.dto.oltp.OperatorZborDtoOLTP;
import com.example.bankingapi.dto.warehouse.TimpDtoWH;
import com.example.bankingapi.dto.warehouse.ZborDtoWH;
import org.springframework.stereotype.Component;

@Component
public class MapperWH {

    public com.example.bankingapi.domain.oltp.ClasaZbor toEntity(ClasaZborDtoOLTP dto) {
        return com.example.bankingapi.domain.oltp.ClasaZbor.builder()
                .denumire(dto.getDenumire())
                .build();
    }

    public ClasaZborDtoOLTP toDto(ClasaZbor entity) {
        return ClasaZborDtoOLTP.builder()
                .id(entity.getId())
                .denumire(entity.getDenumire())
                .build();
    }

    public OperatorZbor toEntity(OperatorZborDtoOLTP dto) {
        return OperatorZbor.builder()
                .id(dto.getId())
                .denumire(dto.getDenumire())
                .build();
    }

    public OperatorZborDtoOLTP toDto(OperatorZbor entity) {
        return OperatorZborDtoOLTP.builder()
                .id(entity.getId())
                .denumire(entity.getDenumire())
                .build();
    }

    public MetodaPlata toEntity(MetodaPlataDtoOLTP dto) {
        return MetodaPlata.builder()
                .denumire(dto.getDenumire())
                .build();
    }

    public MetodaPlataDtoOLTP toDto(MetodaPlata entity) {
        return MetodaPlataDtoOLTP.builder()
                .id(entity.getId())
                .denumire(entity.getDenumire())
                .build();
    }

    public Destinatie toEntity(DestinatieDtoOLTP dto) {
        return Destinatie.builder()
                .id(dto.getId())
                .oras(dto.getOras())
                .stat(dto.getStat())
                .build();
    }

    public DestinatieDtoOLTP toDto(Destinatie entity) {
        return DestinatieDtoOLTP.builder()
                .id(entity.getId())
                .oras(entity.getOras())
                .stat(entity.getStat())
                .build();
    }

    public ZborWH toEntity(ZborDtoWH dto) {
        return ZborWH.builder()
                .id(dto.getId())
                .aeronavaId(dto.getAeronavaId())
                .durata(dto.getDurata())
                .distanta(dto.getDistanta())
                .totalLocuri(dto.getTotalLocuri())
                .anulat(dto.getAnulat())
                .build();
    }

    public ZborDtoWH toDto(ZborWH entity) {
        return ZborDtoWH.builder()
                .id(entity.getId())
                .aeronavaId(entity.getAeronavaId())
                .durata(entity.getDurata())
                .distanta(entity.getDistanta())
                .totalLocuri(entity.getTotalLocuri())
                .anulat(entity.isAnulat())
                .build();
    }

    public TimpWH toEntity(TimpDtoWH dto) {
        return TimpWH.builder()
                .id(dto.getId())
                .ziAn(dto.getZiAn())
                .ziLuna(dto.getZiLuna())
                .ziSaptamana(dto.getZiSaptamana())
                .an(dto.getAn())
                .luna(dto.getLuna())
                .weekend(dto.getWeekend())
                .ora(dto.getOra())
                .minut(dto.getMinut())
                .build();
    }

    public TimpDtoWH toDto(TimpWH entity) {
        return TimpDtoWH.builder()
                .id(entity.getId())
                .ziAn(entity.getZiAn())
                .ziLuna(entity.getZiLuna())
                .ziSaptamana(entity.getZiSaptamana())
                .an(entity.getAn())
                .luna(entity.getLuna())
                .weekend(entity.getWeekend())
                .ora(entity.getOra())
                .minut(entity.getMinut())
                .build();
    }

}
