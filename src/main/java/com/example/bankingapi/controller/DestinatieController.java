package com.example.bankingapi.controller;

import com.example.bankingapi.dto.DestinatieDto;
import com.example.bankingapi.service.DestinatieService;
import com.example.bankingapi.service.Mapper;
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
    
    private final DestinatieService destinatieService;
    private final Mapper mapper;

    @GetMapping("/low")
    public List<DestinatieDto> getAllLow() {
        return destinatieService.findAllLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/non-low")
    public List<DestinatieDto> findAllNonLow() {
        return destinatieService.findAllNonLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/global")
    public List<DestinatieDto> findAllGlobal() {
        return destinatieService.findAllGlobal().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/low")
    public DestinatieDto addLow(@RequestBody DestinatieDto reqDto) {
        return mapper.toDto(destinatieService.addLow(reqDto));
    }

    @PostMapping("/non-low")
    public DestinatieDto addNonLow(@RequestBody DestinatieDto reqDto) {
        return mapper.toDto(destinatieService.addNonLow(reqDto));
    }

    @PostMapping("/global")
    public DestinatieDto addGlobal(@RequestBody DestinatieDto reqDto) {
        return mapper.toDto(destinatieService.addGlobal(reqDto));
    }
}
