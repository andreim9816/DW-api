package com.example.bankingapi.controller;

import com.example.bankingapi.dto.StatDto;
import com.example.bankingapi.service.Mapper;
import com.example.bankingapi.service.StatService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/state")
public class StatController {

    private final StatService statService;
    private final Mapper mapper;

    @GetMapping("/low")
    public List<StatDto> getAllLow() {
        return statService.findAllLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/non-low")
    public List<StatDto> findAllNonLow() {
        return statService.findAllNonLow().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/global")
    public List<StatDto> findAllGlobal() {
        return statService.findAllGlobal().stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/low")
    public StatDto addLow(@RequestBody StatDto reqDto) {
        return mapper.toDto(statService.addLow(reqDto));
    }

    @PostMapping("/non-low")
    public StatDto addNonLow(@RequestBody StatDto reqDto) {
        return mapper.toDto(statService.addNonLow(reqDto));
    }

    @PostMapping("/global")
    public StatDto addGlobal(@RequestBody StatDto reqDto) {
        return mapper.toDto(statService.addGlobal(reqDto));
    }
}
