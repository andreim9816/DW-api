package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.ClasaZborDtoOLTP;
import com.example.bankingapi.service.lowcost.ClasaZborServiceLow;
import com.example.bankingapi.service.lowcost.MapperOLTP;
import com.example.bankingapi.service.nonlowcost.ClasaZborServiceNonLow;
import com.example.bankingapi.service.nonlowcost.MapperWH;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/clase-zbor")
public class ClasaZborController {

    private final ClasaZborServiceLow clasaZborServiceLow;
    private final ClasaZborServiceNonLow clasaZborServiceNonLow;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<ClasaZborDtoOLTP> getAllOLTP() {
        return clasaZborServiceLow.findAll().stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public ClasaZborDtoOLTP addOLTP(@RequestBody ClasaZborDtoOLTP reqDto) {
        return mapperOLTP.toDto(clasaZborServiceLow.add(reqDto));
    }

    @GetMapping("/WH")
    public List<ClasaZborDtoOLTP> getAllWH() {
        return clasaZborServiceNonLow.findAll().stream().map(mapperWH::toDto).collect(Collectors.toList());
    }

//    @PostMapping("/WH")
//    public ClasaZborDtoWH addWH(@RequestBody ClasaZborDtoWH reqDto) {
//        return mapperWH.toDto(clasaZborServiceWH.add(reqDto));
//    }
}
