package com.example.bankingapi.service.oltp;

import com.example.bankingapi.domain.oltp.Client;
import com.example.bankingapi.dto.oltp.ClasaZborDtoOLTP;
import com.example.bankingapi.dto.oltp.ClientDtoOLTP;
import com.example.bankingapi.repository.oltp.ClientRepositoryOLTP;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceOLTP {

    private final ClientRepositoryOLTP clientRepositoryOLTP;
    private final MapperOLTP mapper;

    public List<Client> findAll() {
        return clientRepositoryOLTP.findAll();
    }

    public Client add(ClientDtoOLTP reqDto) {
        return clientRepositoryOLTP.save(mapper.toEntity(reqDto));
    }

}
