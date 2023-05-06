package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.DestinatieDtoOLTP;
import com.example.bankingapi.service.lowcost.DestinatieServiceLow;
import com.example.bankingapi.service.lowcost.MapperOLTP;
import com.example.bankingapi.service.nonlowcost.DestinatieServiceNonLow;
import com.example.bankingapi.service.nonlowcost.MapperWH;
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

    private final DestinatieServiceLow destinatieServiceLow;
    private final DestinatieServiceNonLow destinatieServiceDW;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<DestinatieDtoOLTP> getAllOLTP() {
        return destinatieServiceLow.findAll().stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public DestinatieDtoOLTP addOLTP(@RequestBody DestinatieDtoOLTP reqDto) {
        return mapperOLTP.toDto(destinatieServiceLow.add(reqDto));
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
