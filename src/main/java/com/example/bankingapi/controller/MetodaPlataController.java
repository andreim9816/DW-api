package com.example.bankingapi.controller;

import com.example.bankingapi.dto.MetodaPlataDto;
import com.example.bankingapi.service.Mapper;
import com.example.bankingapi.service.MetodaPlataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/metode-plata")
public class MetodaPlataController {

    private final MetodaPlataService metodaPlataService;
    private final Mapper mapper;

    @GetMapping("/low")
    public List<MetodaPlataDto> getAllLow() {
        return metodaPlataService.findAllLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/non-low")
    public List<MetodaPlataDto> findAllNonLow() {
        return metodaPlataService.findAllNonLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/global")
    public List<MetodaPlataDto> findAllGlobal() {
        return metodaPlataService.findAllGlobal().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/low")
    public MetodaPlataDto addLow(@RequestBody MetodaPlataDto reqDto) {
        return mapper.toDto(metodaPlataService.addLow(reqDto));
    }

    @PostMapping("/non-low")
    public MetodaPlataDto addNonLow(@RequestBody MetodaPlataDto reqDto) {
        return mapper.toDto(metodaPlataService.addNonLow(reqDto));
    }

    @PostMapping("/global")
    public MetodaPlataDto addGlobal(@RequestBody MetodaPlataDto reqDto) {
        return mapper.toDto(metodaPlataService.addGlobal(reqDto));
    }
}
