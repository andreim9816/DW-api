package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.OperatorZborDtoOLTP;
import com.example.bankingapi.service.lowcost.MapperOLTP;
import com.example.bankingapi.service.lowcost.OperatorZborServiceLow;
import com.example.bankingapi.service.nonlowcost.MapperWH;
import com.example.bankingapi.service.nonlowcost.OperatorZborServiceNonwLow;
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

    private final OperatorZborServiceLow operatorZborServiceLow;
    private final OperatorZborServiceNonwLow operatorZborServiceNonwLow;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<OperatorZborDtoOLTP> getAllOLTP() {
        return operatorZborServiceLow.findAll().stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public OperatorZborDtoOLTP addOLTP(@RequestBody OperatorZborDtoOLTP reqDto) {
        return mapperOLTP.toDto(operatorZborServiceLow.add(reqDto));
    }

    @GetMapping("/WH")
    public List<OperatorZborDtoOLTP> getAllWH() {
        return operatorZborServiceNonwLow.findAll().stream().map(mapperWH::toDto).collect(Collectors.toList());
    }
}
