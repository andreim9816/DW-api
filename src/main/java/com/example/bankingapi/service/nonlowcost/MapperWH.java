package com.example.bankingapi.service.nonlowcost;

import com.example.bankingapi.domain.ClasaZbor;
import com.example.bankingapi.domain.Destinatie;
import com.example.bankingapi.domain.MetodaPlata;
import com.example.bankingapi.domain.OperatorZbor;
import com.example.bankingapi.domain.warehouse.*;
import com.example.bankingapi.dto.oltp.ClasaZborDtoOLTP;
import com.example.bankingapi.dto.oltp.DestinatieDtoOLTP;
import com.example.bankingapi.dto.oltp.MetodaPlataDtoOLTP;
import com.example.bankingapi.dto.oltp.OperatorZborDtoOLTP;
import com.example.bankingapi.dto.warehouse.RezervareDtoWH;
import com.example.bankingapi.dto.warehouse.ZborDtoWH;
import org.springframework.stereotype.Component;

@Component
public class MapperWH {

    public ClasaZbor toEntity(ClasaZborDtoOLTP dto) {
        return ClasaZbor.builder()
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

    public RezervareWH toEntity(RezervareDtoWH dto) {
        RezervareId rezervareId = RezervareId.builder()
                .clientId(dto.getClientId())
                .dataRezervare(dto.getDataRezervareId())
                .dataPlecare(dto.getDataPlecareId())
                .dataSosire(dto.getDataSosireId())
                .locatiePlecareId(dto.getLocatiePlecareId())
                .locatieSosireId(dto.getLocatieSosireId())
                .operatorZborId(dto.getOperatorZborId())
                .zborId(dto.getZborId())
                .clasaZborId(dto.getClasaZborId())
                .metodaPlataId(dto.getMetodaPlataId())
                .build();

        return RezervareWH.builder()
                .id(rezervareId)
                .nrPasageri(dto.getNrPasageri())
                .nrPasageriFemei(dto.getNrPasageriFemei())
                .nrPasageriBarbati(dto.getNrPasageriBarbati())
                .sumaTotala(dto.getSumaTotala())
                .build();
    }

    public RezervareDtoWH toDto(RezervareWH entity) {
        return RezervareDtoWH.builder()
                .nrPasageri(entity.getNrPasageri())
                .nrPasageriFemei(entity.getNrPasageriFemei())
                .nrPasageriBarbati(entity.getNrPasageriBarbati())
                .dataRezervareId(entity.getId().getDataRezervare())
                .dataPlecareId(entity.getId().getDataPlecare())
                .dataSosireId(entity.getId().getDataSosire())
                .locatiePlecareId(entity.getId().getLocatiePlecareId())
                .locatieSosireId(entity.getId().getLocatieSosireId())
                .operatorZborId(entity.getId().getOperatorZborId())
                .sumaTotala(entity.getSumaTotala())
                .clientId(entity.getId().getClientId())
                .zborId(entity.getId().getZborId())
                .clasaZborId(entity.getId().getClasaZborId())
                .metodaPlataId(entity.getId().getMetodaPlataId())
                .build();
    }

}
