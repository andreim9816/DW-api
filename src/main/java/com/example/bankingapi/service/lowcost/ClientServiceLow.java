package com.example.bankingapi.service.lowcost;

import com.example.bankingapi.domain.Client;
import com.example.bankingapi.dto.oltp.ClientDtoOLTP;
import com.example.bankingapi.repository.lowcost.ClientRepositoryLow;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceLow {

    private final ClientRepositoryLow clientRepositoryLow;
    private final MapperOLTP mapper;

    public List<Client> findAll() {
        return clientRepositoryLow.findAll();
    }

    public Client add(ClientDtoOLTP reqDto) {
        return clientRepositoryLow.save(mapper.toEntity(reqDto));
    }

}
