package com.example.bankingapi.service.oltp;

import com.example.bankingapi.domain.oltp.*;
import com.example.bankingapi.dto.oltp.*;
import org.springframework.stereotype.Component;

@Component
public class MapperOLTP {

    public ClasaZborOLTP toEntity(ClasaZborDtoOLTP dto) {
        return ClasaZborOLTP.builder()
                .denumire(dto.getDenumire())
                .build();
    }

    public ClasaZborDtoOLTP toDto(ClasaZborOLTP entity) {
        return ClasaZborDtoOLTP.builder()
                .id(entity.getId())
                .denumire(entity.getDenumire())
                .build();
    }

    public OperatorZborOLTP toEntity(OperatorZborDtoOLTP dto) {
        return OperatorZborOLTP.builder()
                .id(dto.getId())
                .denumire(dto.getDenumire())
                .build();
    }

    public OperatorZborDtoOLTP toDto(OperatorZborOLTP entity) {
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

    public Client toEntity(ClientDtoOLTP dto) {
        return Client.builder()
                .nume(dto.getNume())
                .prenume(dto.getPrenume())
                .email(dto.getEmail())
                .numarTelefon(dto.getNumarTelefon())
                .build();
    }

    public ClientDtoOLTP toDto(Client entity) {
        return ClientDtoOLTP.builder()
                .id(entity.getId())
                .nume(entity.getNume())
                .prenume(entity.getPrenume())
                .email(entity.getEmail())
                .numarTelefon(entity.getNumarTelefon())
                .build();
    }


}
