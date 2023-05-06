package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.MetodaPlataDtoOLTP;
import com.example.bankingapi.service.lowcost.MapperOLTP;
import com.example.bankingapi.service.lowcost.MetodaPlataServiceLow;
import com.example.bankingapi.service.nonlowcost.MapperWH;
import com.example.bankingapi.service.nonlowcost.MetodaPlataServiceNonLow;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/metode-plata")
public class MetodaPlataController {

    private final MetodaPlataServiceLow metodaPlataServiceLow;
    private final MetodaPlataServiceNonLow metodaPlataServiceNonLow;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<MetodaPlataDtoOLTP> getAllOLTP() {
        return metodaPlataServiceLow.findAll().stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public MetodaPlataDtoOLTP addOLTP(@RequestBody MetodaPlataDtoOLTP reqDto) {
        return mapperOLTP.toDto(metodaPlataServiceLow.add(reqDto));
    }

    @GetMapping("/WH")
    public List<MetodaPlataDtoOLTP> getAllWH() {
        return metodaPlataServiceNonLow.findAll().stream().map(mapperWH::toDto).collect(Collectors.toList());
    }
//
//    @PostMapping("/WH")
//    public ClasaZborDtoWH addWH(@RequestBody ClasaZborDtoWH reqDto) {
//        return mapperWH.toDto(clasaZborServiceWH.add(reqDto));
//    }
}
