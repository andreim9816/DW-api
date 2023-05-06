package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.RezervareDtoOLTP;
import com.example.bankingapi.dto.warehouse.RezervareDtoWH;
import com.example.bankingapi.service.lowcost.MapperOLTP;
import com.example.bankingapi.service.lowcost.RezervariServiceLow;
import com.example.bankingapi.service.nonlowcost.MapperWH;
import com.example.bankingapi.service.nonlowcost.RezervariServiceNonwLow;
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

    private final RezervariServiceLow rezervariServiceLow;
    private final RezervariServiceNonwLow rezervariServiceNonwLow;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<RezervareDtoOLTP> getAllOLTP(@RequestParam("sortOrder") String sortOrder,
                                             @RequestParam("pageNumber") Integer pageNumber,
                                             @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return rezervariServiceLow.findAll(pageRequest).stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public RezervareDtoOLTP addOLTP(@RequestBody RezervareDtoOLTP reqDto) {
        return mapperOLTP.toDto(rezervariServiceLow.add(reqDto));
    }

    @GetMapping("/WH")
    public List<RezervareDtoWH> getAllWH(@RequestParam("sortOrder") String sortOrder,
                                         @RequestParam("pageNumber") Integer pageNumber,
                                         @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return rezervariServiceNonwLow.findAll(pageRequest).stream().map(mapperWH::toDto).collect(Collectors.toList());
    }
//
//    @PostMapping("/WH")
//    public ClasaZborDtoWH addWH(@RequestBody ClasaZborDtoWH reqDto) {
//        return mapperWH.toDto(clasaZborServiceWH.add(reqDto));
//    }
}
