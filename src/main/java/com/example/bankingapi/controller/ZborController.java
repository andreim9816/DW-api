package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.ZborDtoOLTP;
import com.example.bankingapi.dto.warehouse.ZborDtoWH;
import com.example.bankingapi.service.oltp.MapperOLTP;
import com.example.bankingapi.service.oltp.ZborServiceOLTP;
import com.example.bankingapi.service.warehouse.MapperWH;
import com.example.bankingapi.service.warehouse.ZborServiceWH;
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

    private final ZborServiceOLTP zborServiceOLTP;
    private final ZborServiceWH zborServiceWH;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<ZborDtoOLTP> getAllOLTP(@RequestParam("sortOrder") String sortOrder,
                                        @RequestParam("pageNumber") Integer pageNumber,
                                        @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return zborServiceOLTP.findAll(pageRequest).stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public ZborDtoOLTP addOLTP(@RequestBody ZborDtoOLTP reqDto) {
        return mapperOLTP.toDto(zborServiceOLTP.add(reqDto));
    }

    @GetMapping("/WH")
    public List<ZborDtoWH> getAllWH(@RequestParam("sortOrder") String sortOrder,
                                        @RequestParam("pageNumber") Integer pageNumber,
                                        @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return zborServiceWH.findAll(pageRequest).stream().map(mapperWH::toDto).collect(Collectors.toList());
    }
//
//    @PostMapping("/WH")
//    public ClasaZborDtoWH addWH(@RequestBody ClasaZborDtoWH reqDto) {
//        return mapperWH.toDto(clasaZborServiceWH.add(reqDto));
//    }
}
