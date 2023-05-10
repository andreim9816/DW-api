package com.example.bankingapi.controller;

import com.example.bankingapi.dto.PlataDto;
import com.example.bankingapi.service.Mapper;
import com.example.bankingapi.service.PlataService;
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
@RequestMapping("/plati")
public class PlataController {

    private final PlataService plataService;
    private final Mapper mapper;

    @GetMapping("/low")
    public List<PlataDto> getAllLow(@RequestParam("sortOrder") String sortOrder,
                                    @RequestParam("pageNumber") Integer pageNumber,
                                    @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return plataService.findAllLow(pageRequest).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/non-low")
    public List<PlataDto> findAllNonLow(@RequestParam("sortOrder") String sortOrder,
                                        @RequestParam("pageNumber") Integer pageNumber,
                                        @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());

        return plataService.findAllNonLow(pageRequest).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/global")
    public List<PlataDto> findAllGlobal(@RequestParam("sortOrder") String sortOrder,
                                        @RequestParam("pageNumber") Integer pageNumber,
                                        @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return plataService.findAllGlobal(pageRequest).stream().map(mapper::toDto).collect(Collectors.toList());
    }

    @PostMapping("/low")
    public PlataDto addLow(@RequestBody PlataDto reqDto) {
        return mapper.toDto(plataService.addLow(reqDto));
    }

    @PostMapping("/non-low")
    public PlataDto addNonLow(@RequestBody PlataDto reqDto) {
        return mapper.toDto(plataService.addNonLow(reqDto));
    }

    @PostMapping("/global")
    public PlataDto addGlobal(@RequestBody PlataDto reqDto) {
        return mapper.toDto(plataService.addGlobal(reqDto));
    }
}
