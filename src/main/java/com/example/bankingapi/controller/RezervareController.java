package com.example.bankingapi.controller;

import com.example.bankingapi.dto.oltp.RezervareDtoOLTP;
import com.example.bankingapi.service.oltp.MapperOLTP;
import com.example.bankingapi.service.oltp.RezervariServiceOLTP;
import com.example.bankingapi.service.warehouse.MapperWH;
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

    private final RezervariServiceOLTP rezervariServiceOLTP;
    //    private final ClasaZborServiceWH clasaZborServiceWH;
    private final MapperOLTP mapperOLTP;
    private final MapperWH mapperWH;

    @GetMapping("/OLTP")
    public List<RezervareDtoOLTP> getAllOLTP(@RequestParam("sortOrder") String sortOrder,
                                             @RequestParam("pageNumber") Integer pageNumber,
                                             @RequestParam("pageSize") Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, Sort.by("id").descending());
        return rezervariServiceOLTP.findAll(pageRequest).stream().map(mapperOLTP::toDto).collect(Collectors.toList());
    }

    @PostMapping("/OLTP")
    public RezervareDtoOLTP addOLTP(@RequestBody RezervareDtoOLTP reqDto) {
        return mapperOLTP.toDto(rezervariServiceOLTP.add(reqDto));
    }

//    @GetMapping("/WH")
//    public List<ClasaZborDtoWH> getAllWH() {
//        return clasaZborServiceWH.findAll().stream().map(mapperWH::toDto).collect(Collectors.toList());
//    }
//
//    @PostMapping("/WH")
//    public ClasaZborDtoWH addWH(@RequestBody ClasaZborDtoWH reqDto) {
//        return mapperWH.toDto(clasaZborServiceWH.add(reqDto));
//    }
}
