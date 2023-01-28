package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.MetodaPlataDtoOLTP;
import com.example.bankingapi.dto.oltp.OperatorZborDtoOLTP;
import com.example.bankingapi.service.oltp.MapperOLTP;
import com.example.bankingapi.service.oltp.MetodaPlataServiceOLTP;
import com.example.bankingapi.service.oltp.OperatorZborServiceOLTP;
import com.example.bankingapi.service.warehouse.MapperWH;
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

    private final MetodaPlataServiceOLTP metodaPlataServiceOLTP;
//    private final ClasaZborServiceWH clasaZborServiceWH;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<MetodaPlataDtoOLTP> getAllOLTP() {
        return metodaPlataServiceOLTP.findAll().stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public MetodaPlataDtoOLTP addOLTP(@RequestBody MetodaPlataDtoOLTP reqDto) {
        return mapperOLTP.toDto(metodaPlataServiceOLTP.add(reqDto));
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
