package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.ClientDtoOLTP;
import com.example.bankingapi.service.oltp.ClientServiceOLTP;
import com.example.bankingapi.service.oltp.MapperOLTP;
import com.example.bankingapi.service.warehouse.MapperWH;
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

    private final ClientServiceOLTP clientServiceOLTP;
    //    private final ClasaZborServiceWH clasaZborServiceWH;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<ClientDtoOLTP> getAllOLTP() {
        return clientServiceOLTP.findAll().stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public ClientDtoOLTP addOLTP(@RequestBody ClientDtoOLTP reqDto) {
        return mapperOLTP.toDto(clientServiceOLTP.add(reqDto));
    }

//    @GetMapping("/WH")
//    public List<ClasaZborDtoWH> getAllWH() {
//        return clasaZborServiceWH.findAll().stream().map(mapperWH::toDto).collect(Collectors.toList());
//    }
//
//    @PostMapping("/WH")
//    public ClasaZborDtoWH addWH(@RequestBody ClasaZborDtoWH reqDto) {
//        return mapperWH.toDto(clasaZborServiceWH.add(reqDto));
//    }
}
