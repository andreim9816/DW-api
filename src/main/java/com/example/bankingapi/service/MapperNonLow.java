//package com.example.bankingapi.service;
//
//import com.example.bankingapi.domain.*;
//import com.example.bankingapi.dto.*;
//import com.example.bankingapi.repository.nonlowcost.*;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class MapperNonLow {
//
//    private final OperatorZborRepositoryNonLow operatorZborRepository;
//    private final DestinatieRepositoryNonLow destinatieRepository;
//    private final ClasaZborRepositoryNonLow clasaZborRepository;
//    private final MetodaPlataRepositoryNonLow metodaPlataRepository;
//    private final ClientRepositoryNonLow clientRepository;
//    private final ZborRepositoryNonLow zborRepository;
//    private final StatRepositoryNonLow statRepository;
//    private final RezervareRepositoryNonLow rezervareRepository;
//    private final AeronavaRepositoryNonLow aeronavaRepository;
//
//    public Aeronava toEntity(AeronavaDto dto) {
//        return Aeronava.builder()
//                .id(dto.getId())
//                .nume(dto.getNume())
//                .producator(dto.getProducator())
//                .build();
//    }
//
//    public AeronavaDto toEntity(Aeronava entity) {
//        return AeronavaDto.builder()
//                .id(entity.getId())
//                .nume(entity.getNume())
//                .producator(entity.getProducator())
//                .build();
//    }
//
//    public ClasaZbor toEntity(ClasaZborDto dto) {
//        return ClasaZbor.builder()
//                .id(dto.getId())
//                .denumire(dto.getDenumire())
//                .build();
//    }
//
//    public ClasaZborDto toDto(ClasaZbor entity) {
//        return ClasaZborDto.builder()
//                .id(entity.getId())
//                .denumire(entity.getDenumire())
//                .build();
//    }
//
//
//    public ClientNonGDPR toEntity(ClientDto dto) {
//        return ClientNonGDPR.builder()
//                .isPremium(dto.getPremium())
//                .dataInregistrare(dto.getDataInregistrare())
//                .build();
//    }
//
//    public ClientDto toDto(ClientNonGDPR entity) {
//        return ClientDto.builder()
//                .id(entity.getId())
//                .premium(entity.getIsPremium())
//                .dataInregistrare(entity.getDataInregistrare())
//                .build();
//    }
//
//    public ClientGDPR toEntity(ClientDatePersonaleDto dto) {
//        return ClientGDPR.builder()
//                .nume(dto.getNume())
//                .prenume(dto.getPrenume())
//                .email(dto.getEmail())
//                .numarTelefon(dto.getNumarTelefon())
//                .build();
//    }
//
//    public ClientDatePersonaleDto toDto(ClientGDPR entity) {
//        return ClientDatePersonaleDto.builder()
//                .id(entity.getId())
//                .nume(entity.getNume())
//                .prenume(entity.getPrenume())
//                .email(entity.getEmail())
//                .numarTelefon(entity.getNumarTelefon())
//                .build();
//    }
//
//    public Destinatie toEntity(DestinatieDto dto) {
//        return Destinatie.builder()
//                .id(dto.getId())
//                .oras(dto.getOras())
//                .stat(statRepository.findById(dto.getStatId()).orElse(null))
//                .build();
//    }
//
//    public DestinatieDto toDto(Destinatie entity) {
//        return DestinatieDto.builder()
//                .id(entity.getId())
//                .oras(entity.getOras())
//                .statId(entity.getStat().getId())
//                .build();
//    }
//
//    public MetodaPlata toEntity(MetodaPlataDto dto) {
//        return MetodaPlata.builder()
//                .id(dto.getId())
//                .denumire(dto.getDenumire())
//                .build();
//    }
//
//    public MetodaPlataDto toDto(MetodaPlata entity) {
//        return MetodaPlataDto.builder()
//                .id(entity.getId())
//                .denumire(entity.getDenumire())
//                .build();
//    }
//
//    public Plata toEntity(PlataDto dto) {
//        return Plata.builder()
//                .id(dto.getId())
//                .dataPlata(dto.getDataPlata())
//                .sumaTotala(dto.getSumaTotala())
//                .metodaPlata(metodaPlataRepository.findById(dto.getMetodaPlataId()).orElse(null))
//                .rezervare(rezervareRepository.findById(dto.getRezervareId()).orElse(null))
//                .build();
//    }
//
//    public PlataDto toDto(Plata entity) {
//        return PlataDto.builder()
//                .id(entity.getId())
//                .dataPlata(entity.getDataPlata())
//                .sumaTotala(entity.getSumaTotala())
//                .metodaPlataId(entity.getMetodaPlata().getId())
//                .rezervareId(entity.getRezervare().getId())
//                .build();
//    }
//
//    public OperatorZborDto toDto(OperatorZbor entity) {
//        return OperatorZborDto.builder()
//                .id(entity.getId())
//                .nume(entity.getNume())
//                .tip(entity.getTip())
//                .build();
//    }
//
//    public OperatorZbor toEntity(OperatorZborDto dto) {
//        return OperatorZbor.builder()
//                .id(dto.getId())
//                .nume(dto.getNume())
//                .tip(dto.getTip())
//                .build();
//    }
//
//    public Zbor toEntity(ZborDto dto) {
//        return Zbor.builder()
//                .id(dto.getId())
//                .operatorZbor(operatorZborRepository.findById(dto.getOperatorId()).orElse(null))
//                .aeronavaId(dto.getAeronavaId())
//                .durata(dto.getDurata())
//                .distanta(dto.getDistanta())
//                .totalLocuri(dto.getTotalLocuri())
//                .anulat(dto.getAnulat())
//                .dataPlecare(dto.getDataPlecare())
//                .dataSosire(dto.getDataSosire())
//                .locatiePlecare(destinatieRepository.findById(dto.getLocatiePlecareId()).orElse(null))
//                .locatieSosire(destinatieRepository.findById(dto.getLocatieSosireId()).orElse(null))
//                .build();
//    }
//
//    public ZborDto toDto(Zbor entity) {
//        return ZborDto.builder()
//                .id(entity.getId())
//                .operatorId(entity.getOperatorZbor().getId())
//                .aeronavaId(entity.getAeronavaId())
//                .durata(entity.getDurata())
//                .distanta(entity.getDistanta())
//                .totalLocuri(entity.getTotalLocuri())
//                .anulat(entity.isAnulat())
//                .dataPlecare(entity.getDataPlecare())
//                .dataSosire(entity.getDataSosire())
//                .locatiePlecareId(entity.getLocatiePlecare().getId())
//                .locatieSosireId(entity.getLocatieSosire().getId())
//                .build();
//    }
//
//    public Rezervare toEntity(RezervareDto dto) {
//        return Rezervare.builder()
//                .id(dto.getId())
//                .nrPasageri(dto.getNrPasageri())
//                .nrPasageriFemei(dto.getNrPasageriFemei())
//                .nrPasageriBarbati(dto.getNrPasageriBarbati())
//                .dataRezervare(dto.getDataRezervare())
//                .clientNonGDPR(clientRepository.findById(dto.getClientId()).orElse(null))
//                .zbor(zborRepository.findById(dto.getZborId()).orElse(null))
//                .clasaZbor(clasaZborRepository.findById(dto.getClasaZborId()).orElse(null))
//                .build();
//    }
//
//    public RezervareDto toDto(Rezervare entity) {
//        return RezervareDto.builder()
//                .id(entity.getId())
//                .nrPasageri(entity.getNrPasageri())
//                .nrPasageriFemei(entity.getNrPasageriFemei())
//                .nrPasageriBarbati(entity.getNrPasageriBarbati())
//                .dataRezervare(entity.getDataRezervare())
//                .clientId(entity.getClientNonGDPR().getId())
//                .zborId(entity.getZbor().getId())
//                .clasaZborId(entity.getClasaZbor().getId())
//                .build();
//    }
//
//    public StatDto toDto(Stat entity) {
//        return StatDto.builder()
//                .id(entity.getId())
//                .nume(entity.getNume())
//                .build();
//    }
//
//    public Stat toEntity(StatDto dto) {
//        return Stat.builder()
//                .id(dto.getId())
//                .nume(dto.getNume())
//                .build();
//    }
//
//}
