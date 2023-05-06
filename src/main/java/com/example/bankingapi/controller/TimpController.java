package com.example.bankingapi.controller;

import com.example.bankingapi.dto.warehouse.TimpDtoWH;
import com.example.bankingapi.service.nonlowcost.MapperWH;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/timpi")
public class TimpController {

    private final TimpServiceWH timpServiceWH;
    private final MapperWH mapperWH;

    @GetMapping("/WH")
    public List<TimpDtoWH> getAllWH(@RequestParam("sortOrder") String sortOrder,
                                    @RequestParam("pageNumber") Integer pageNumber,
                                    @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return timpServiceWH.findAll(pageRequest).stream().map(mapperWH::toDto).collect(Collectors.toList());
    }
}
