package com.example.bankingapi.service.oltp;

import com.example.bankingapi.domain.oltp.*;
import com.example.bankingapi.dto.oltp.*;
import com.example.bankingapi.repository.oltp.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class MapperOLTP {

    private final OperatorZborRepositoryOLTP operatorZborRepositoryOLTP;
    private final DestinatieRepositoryOLTP destinatieRepositoryOLTP;
    private final ClasaZborRepositoryOLTP clasaZborRepositoryOLTP;
    private final MetodaPlataRepositoryOLTP metodaPlataRepositoryOLTP;
    private final ClientRepositoryOLTP clientRepositoryOLTP;
    private final ZborRepositoryOLTP zborRepositoryOLTP;

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

    public Zbor toEntity(ZborDtoOLTP dto) {
        return Zbor.builder()
                .id(dto.getId())
                .operatorZbor(operatorZborRepositoryOLTP.findById(dto.getOperatorId()).orElse(null))
                .aeronavaId(dto.getAeronavaId())
                .durata(dto.getDurata())
                .distanta(dto.getDistanta())
                .totalLocuri(dto.getTotalLocuri())
                .anulat(dto.getAnulat())
                .dataPlecare(dto.getDataPlecare())
                .dataSosire(dto.getDataSosire())
                .locatiePlecare(destinatieRepositoryOLTP.findById(dto.getLocatiePlecareId()).orElse(null))
                .locatieSosire(destinatieRepositoryOLTP.findById(dto.getLocatieSosireId()).orElse(null))
                .build();
    }

    public ZborDtoOLTP toDto(Zbor entity) {
        return ZborDtoOLTP.builder()
                .id(entity.getId())
                .operatorId(entity.getOperatorZbor().getId())
                .aeronavaId(entity.getAeronavaId())
                .durata(entity.getDurata())
                .distanta(entity.getDistanta())
                .totalLocuri(entity.getTotalLocuri())
                .anulat(entity.isAnulat())
                .dataPlecare(entity.getDataPlecare())
                .dataSosire(entity.getDataSosire())
                .locatiePlecareId(entity.getLocatiePlecare().getId())
                .locatieSosireId(entity.getLocatieSosire().getId())
                .build();
    }

    public Rezervare toEntity(RezervareDtoOLTP dto) {
        return Rezervare.builder()
//                .id(dto.getId())
                .nrPasageri(dto.getNrPasageri())
                .nrPasageriFemei(dto.getNrPasageriFemei())
                .nrPasageriBarbati(dto.getNrPasageriBarbati())
                .dataRezervare(dto.getDataRezervare())
                .sumaTotala(dto.getSumaTotala())
                .client(clientRepositoryOLTP.findById(dto.getClientId()).orElse(null))
                .zbor(zborRepositoryOLTP.findById(dto.getZborId()).orElse(null))
                .clasaZbor(clasaZborRepositoryOLTP.findById(dto.getClasaZborId()).orElse(null))
                .metodaPlata(metodaPlataRepositoryOLTP.findById(dto.getMetodaPlataId()).orElse(null))
                .build();
    }

    public RezervareDtoOLTP toDto(Rezervare entity) {
        return RezervareDtoOLTP.builder()
                .id(entity.getId())
                .nrPasageri(entity.getNrPasageri())
                .nrPasageriFemei(entity.getNrPasageriFemei())
                .nrPasageriBarbati(entity.getNrPasageriBarbati())
                .dataRezervare(entity.getDataRezervare())
                .sumaTotala(entity.getSumaTotala())
                .clientId(entity.getClient().getId())
                .zborId(entity.getZbor().getId())
                .clasaZborId(entity.getClasaZbor().getId())
                .metodaPlataId(entity.getMetodaPlata().getId())
                .build();
    }
}
