//package com.example.bankingapi.service.lowcost;
//
//import com.example.bankingapi.domain.*;
//import com.example.bankingapi.dto.*;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.NullValuePropertyMappingStrategy;
//import org.mapstruct.ReportingPolicy;
//import org.springframework.expression.spel.ast.Operator;
//
//@Mapper(componentModel = "spring",
//        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
//        unmappedTargetPolicy = ReportingPolicy.WARN, uses = LowCostQualifier.class)
//public interface DoctorMapper {
//
//    AeronavaDto toDto(Aeronava entity);
//
//    ClasaZborDto toDto(ClasaZbor entity);
//
//    DestinatieDto toDto(Destinatie entity);
//
//    MetodaPlataDto toDto(MetodaPlata entity);
//
//    OperatorZborDto toDto(Operator entity);
//
//    PlataDto toDto(Plata entity);
//
//    RezervareDto toDto(Rezervare entity);
//
//    StatDto toDto(Stat entity);
//
//    ZborDto toDto(Zbor entity);
//
//    Aeronava toEntity(AeronavaDto dto);
//
//    ClasaZbor toEntity(ClasaZborDto dto);
//
//    @Mapping(source = "statId", target = "stat.id", qualifiedByName = "idToStat")
//    Destinatie toEntity(DestinatieDto dto);
//
//
//    @Mapping(source = "statId", target = "stat.id", qualifiedByName = "idToStat")
//    Destinatie toEntity(DestinatieDto dto);
//
//}
