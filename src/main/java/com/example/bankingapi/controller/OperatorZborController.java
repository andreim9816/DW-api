package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.ClasaZborDtoOLTP;
import com.example.bankingapi.dto.oltp.OperatorZborDtoOLTP;
import com.example.bankingapi.dto.warehouse.ClasaZborDtoWH;
import com.example.bankingapi.service.oltp.ClasaZborServiceOLTP;
import com.example.bankingapi.service.oltp.MapperOLTP;
import com.example.bankingapi.service.oltp.OperatorZborServiceOLTP;
import com.example.bankingapi.service.warehouse.ClasaZborServiceWH;
import com.example.bankingapi.service.warehouse.MapperWH;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/operatori-zbor")
public class OperatorZborController {

    private final OperatorZborServiceOLTP operatorZborServiceOLTP;
//    private final ClasaZborServiceWH clasaZborServiceWH;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<OperatorZborDtoOLTP> getAllOLTP() {
        return operatorZborServiceOLTP.findAll().stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public OperatorZborDtoOLTP addOLTP(@RequestBody OperatorZborDtoOLTP reqDto) {
        return mapperOLTP.toDto(operatorZborServiceOLTP.add(reqDto));
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
