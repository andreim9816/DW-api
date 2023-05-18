package com.example.bankingapi.service;

import com.example.bankingapi.domain.Client;
import com.example.bankingapi.dto.ClientDto;
import com.example.bankingapi.repository.global.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    private final ClientRepository clientRepositoryGlobal;
    private final Mapper mapper;

    public List<Client> findAllGlobal() {
        return clientRepositoryGlobal.findAll();
    }

    public Client addGlobal(ClientDto reqDto) {
        return clientRepositoryGlobal.save(mapper.toEntity(reqDto));
    }
}
