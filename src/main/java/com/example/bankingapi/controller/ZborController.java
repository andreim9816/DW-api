package com.example.bankingapi.controller;

import com.example.bankingapi.dto.ZborDto;
import com.example.bankingapi.service.Mapper;
import com.example.bankingapi.service.ZborService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/zboruri")
public class ZborController {
    private final ZborService zborService;
    private final Mapper mapper;

    @GetMapping("/low")
    public List<ZborDto> getAllLow(@RequestParam("sortOrder") String sortOrder,
                                   @RequestParam("pageNumber") Integer pageNumber,
                                   @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return zborService.findAllLow(pageRequest).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/non-low")
    public List<ZborDto> findAllNonLow(@RequestParam("sortOrder") String sortOrder,
                                       @RequestParam("pageNumber") Integer pageNumber,
                                       @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return zborService.findAllNonLow(pageRequest).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/global")
    public List<ZborDto> findAllGlobal(@RequestParam("sortOrder") String sortOrder,
                                       @RequestParam("pageNumber") Integer pageNumber,
                                       @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return zborService.findAllGlobal(pageRequest).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/low")
    public ZborDto addLow(@RequestBody ZborDto reqDto) {
        return mapper.toDto(zborService.addLow(reqDto));
    }

    @PostMapping("/non-low")
    public ZborDto addNonLow(@RequestBody ZborDto reqDto) {
        return mapper.toDto(zborService.addNonLow(reqDto));
    }

    @PostMapping("/global")
    public ZborDto addGlobal(@RequestBody ZborDto reqDto) {
        return mapper.toDto(zborService.addGlobal(reqDto));
    }

}
