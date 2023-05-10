package com.example.bankingapi.controller;

import com.example.bankingapi.dto.OperatorZborDto;
import com.example.bankingapi.service.Mapper;
import com.example.bankingapi.service.OperatorZborService;
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

    private final OperatorZborService service;
    private final Mapper mapper;

    @GetMapping("/low")
    public List<OperatorZborDto> getAllLow() {
        return service.findAllLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/non-low")
    public List<OperatorZborDto> findAllNonLow() {
        return service.findAllNonLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/global")
    public List<OperatorZborDto> findAllGlobal() {
        return service.findAllGlobal().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/low")
    public OperatorZborDto addLow(@RequestBody OperatorZborDto reqDto) {
        return mapper.toDto(service.addLow(reqDto));
    }

    @PostMapping("/non-low")
    public OperatorZborDto addNonLow(@RequestBody OperatorZborDto reqDto) {
        return mapper.toDto(service.addNonLow(reqDto));
    }

    @PostMapping("/global")
    public OperatorZborDto addGlobal(@RequestBody OperatorZborDto reqDto) {
        return mapper.toDto(service.addGlobal(reqDto));
    }
}
