package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.DestinatieDtoOLTP;
import com.example.bankingapi.dto.oltp.OperatorZborDtoOLTP;
import com.example.bankingapi.service.oltp.DestinatieServiceOLTP;
import com.example.bankingapi.service.oltp.MapperOLTP;
import com.example.bankingapi.service.oltp.OperatorZborServiceOLTP;
import com.example.bankingapi.service.warehouse.DestinatieServiceWH;
import com.example.bankingapi.service.warehouse.MapperWH;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/destinatii")
public class DestinatieController {

    private final DestinatieServiceOLTP destinatieServiceOLTP;
    private final DestinatieServiceWH destinatieServiceDW;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<DestinatieDtoOLTP> getAllOLTP() {
        return destinatieServiceOLTP.findAll().stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public DestinatieDtoOLTP addOLTP(@RequestBody DestinatieDtoOLTP reqDto) {
        return mapperOLTP.toDto(destinatieServiceOLTP.add(reqDto));
    }

    @GetMapping("/WH")
    public List<DestinatieDtoOLTP> getAllWH() {
        return destinatieServiceDW.findAll().stream().map(mapperWH::toDto).collect(Collectors.toList());
    }
//
//    @PostMapping("/WH")
//    public ClasaZborDtoWH addWH(@RequestBody ClasaZborDtoWH reqDto) {
//        return mapperWH.toDto(clasaZborServiceWH.add(reqDto));
//    }
}
