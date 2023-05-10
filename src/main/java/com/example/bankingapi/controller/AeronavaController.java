package com.example.bankingapi.controller;

import com.example.bankingapi.dto.AeronavaDto;
import com.example.bankingapi.service.Mapper;
import com.example.bankingapi.service.AeronavaService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/aeronave")
public class AeronavaController {
    private final AeronavaService aeronavaService;
    private final Mapper mapper;

    @GetMapping("/low")
    public List<AeronavaDto> getAllLow() {
        return aeronavaService.findAllLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/non-low")
    public List<AeronavaDto> findAllNonLow() {
        return aeronavaService.findAllNonLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/global")
    public List<AeronavaDto> findAllGlobal() {
        return aeronavaService.findAllGlobal().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/low")
    public AeronavaDto addLow(@RequestBody AeronavaDto reqDto) {
        return mapper.toDto(aeronavaService.addLow(reqDto));
    }

    @PostMapping("/non-low")
    public AeronavaDto addNonLow(@RequestBody AeronavaDto reqDto) {
        return mapper.toDto(aeronavaService.addNonLow(reqDto));
    }

    @PostMapping("/global")
    public AeronavaDto addGlobal(@RequestBody AeronavaDto reqDto) {
        return mapper.toDto(aeronavaService.addGlobal(reqDto));
    }

}
