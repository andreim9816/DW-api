package com.example.bankingapi.controller;

import com.example.bankingapi.dto.RezervareDto;
import com.example.bankingapi.service.Mapper;
import com.example.bankingapi.service.RezervareService;
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
@RequestMapping("/rezervari")
public class RezervareController {

    private final RezervareService rezervareService;
    private final Mapper mapper;

    @GetMapping("/low")
    public List<RezervareDto> getAllLow(@RequestParam("sortOrder") String sortOrder,
                                        @RequestParam("pageNumber") Integer pageNumber,
                                        @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return rezervareService.findAllLow(pageRequest).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/non-low")
    public List<RezervareDto> findAllNonLow(@RequestParam("sortOrder") String sortOrder,
                                            @RequestParam("pageNumber") Integer pageNumber,
                                            @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return rezervareService.findAllNonLow(pageRequest).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/global")
    public List<RezervareDto> findAllGlobal(@RequestParam("sortOrder") String sortOrder,
                                            @RequestParam("pageNumber") Integer pageNumber,
                                            @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return rezervareService.findAllGlobal(pageRequest).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/low")
    public RezervareDto addLow(@RequestBody RezervareDto reqDto) {
        return mapper.toDto(rezervareService.addLow(reqDto));
    }

    @PostMapping("/non-low")
    public RezervareDto addNonLow(@RequestBody RezervareDto reqDto) {
        return mapper.toDto(rezervareService.addNonLow(reqDto));
    }

    @PostMapping("/global")
    public RezervareDto addGlobal(@RequestBody RezervareDto reqDto) {
        return mapper.toDto(rezervareService.addGlobal(reqDto));
    }
}
