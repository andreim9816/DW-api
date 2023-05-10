//package com.example.bankingapi.service.lowcost;
//
//import com.example.bankingapi.domain.*;
//import com.example.bankingapi.repository.lowcost.*;
//import jdk.jfr.Name;
//import lombok.RequiredArgsConstructor;
//import org.mapstruct.Named;
//import org.springframework.stereotype.Component;
//
//@Component
//@RequiredArgsConstructor
//public class LowCostQualifier {
//
//
//    private final ZborRepositoryLow zborRepositoryLow;
//    private final AeronavaRepositoryLow aeronavaRepositoryLow;
//    private final StatRepositoryLow statRepositoryLow;
//    private final MetodaPlataRepositoryLow metodaPlataRepositoryLow;
//    private final RezervareRepositoryLow rezervareRepositoryLow;
//    private final OperatorZborRepositoryLow operatorZborRepositoryLow;
//    private final DestinatieRepositoryLow destinatieRepositoryLow;
//    private final ClasaZborRepositoryLow clasaZborRepositoryLow;
//
//    @Named("idToZbor")
//    public Zbor idToZbor(Long id) {
//        return zborRepositoryLow.getById(id);
//    }
//
//    @Name("idToAeronava")
//    public Aeronava idToAeronava(Long id) {
//        return aeronavaRepositoryLow.getById(id);
//    }
//
//    @Name("idToStat")
//    public Stat idToStat(String id) {
//        return statRepositoryLow.getById(id);
//    }
//
//    @Name("idToMetodaPlata")
//    public MetodaPlata idToMetodaPlata(Long id) {
//        return metodaPlataRepositoryLow.getById(id);
//    }
//
//    @Name("idToRezervare")
//    public Rezervare idToRezervare(Long id) {
//        return rezervareRepositoryLow.getById(id);
//    }
//
//    @Name("idToOperatorZbor")
//    public OperatorZbor idToOperatorZbor(String id) {
//        return operatorZborRepositoryLow.getById(id);
//    }
//
//    @Name("idToDestinatie")
//    public Destinatie idToDestinatie(String id) {
//        return destinatieRepositoryLow.getById(id);
//    }
//
//    @Name("idToClasaZbor")
//    public ClasaZbor idToClasaZbor(Long id) {
//        return clasaZborRepositoryLow.getById(id);
//    }
//
//}
