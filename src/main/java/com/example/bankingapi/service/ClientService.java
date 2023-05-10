//package com.example.bankingapi.service;
//
//import com.example.bankingapi.domain.ClientNonGDPR;
//import com.example.bankingapi.dto.ClientDto;
//import com.example.bankingapi.repository.lowcost.ClientRepositoryLow;
//import com.example.bankingapi.repository.nonlowcost.ClientRepositoryNonLow;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class ClientService {
//
//    private final ClientRepositoryLow clientRepositoryLow;
//    private final ClientRepositoryNonLow clientRepositoryNonLow;
//    private final ClientRepositoryGlobal clientRepositoryGlobal;
//    private final Mapper mapper;
//
//    public List<ClientNonGDPR> findAll() {
//        return clientRepositoryLow.findAll();
//    }
//
//    public ClientNonGDPR add(ClientDto reqDto) {
//        return clientRepositoryLow.save(mapper.toEntity(reqDto));
//    }
//
//}
