package com.example.bankingapi.controller;

import com.example.bankingapi.dto.ClientDto;
import com.example.bankingapi.service.ClientService;
import com.example.bankingapi.service.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/clienti")
public class ClientController {

    private final ClientService clientService;
    private final Mapper mapper;


    @GetMapping("/global")
    public List<ClientDto> findAllGlobal() {
        return clientService.findAllGlobal().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/global")
    public ClientDto addGlobal(@RequestBody ClientDto reqDto) {
        return mapper.toDto(clientService.addGlobal(reqDto));
    }

}
