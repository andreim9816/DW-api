package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.OperatorZborDtoOLTP;
import com.example.bankingapi.service.oltp.MapperOLTP;
import com.example.bankingapi.service.oltp.OperatorZborServiceOLTP;
import com.example.bankingapi.service.warehouse.MapperWH;
import com.example.bankingapi.service.warehouse.OperatorZborServiceWH;
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
    private final OperatorZborServiceWH operatorZborServiceWH;
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

    @GetMapping("/WH")
    public List<OperatorZborDtoOLTP> getAllWH() {
        return operatorZborServiceWH.findAll().stream().map(mapperWH::toDto).collect(Collectors.toList());
    }
}
