package com.example.bankingapi.controller;

import com.example.bankingapi.dto.ClasaZborDto;
import com.example.bankingapi.service.ClasaZborService;
import com.example.bankingapi.service.Mapper;
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

    private final ClasaZborService clasaZborService;
    private final Mapper mapper;

    @GetMapping("/low")
    public List<ClasaZborDto> getAllLow() {
        return clasaZborService.findAllLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/non-low")
    public List<ClasaZborDto> findAllNonLow() {
        return clasaZborService.findAllNonLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/global")
    public List<ClasaZborDto> findAllGlobal() {
        return clasaZborService.findAllGlobal().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/low")
    public ClasaZborDto addLow(@RequestBody ClasaZborDto reqDto) {
        return mapper.toDto(clasaZborService.addLow(reqDto));
    }

    @PostMapping("/non-low")
    public ClasaZborDto addNonLow(@RequestBody ClasaZborDto reqDto) {
        return mapper.toDto(clasaZborService.addNonLow(reqDto));
    }

    @PostMapping("/global")
    public ClasaZborDto addGlobal(@RequestBody ClasaZborDto reqDto) {
        return mapper.toDto(clasaZborService.addGlobal(reqDto));
    }
}
