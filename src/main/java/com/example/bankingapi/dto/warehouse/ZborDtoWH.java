package com.example.bankingapi.dto.warehouse;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZborDtoWH {
    private Long id;
    private String aeronavaId;
    private Integer durata;
    private Integer distanta;
    private Integer totalLocuri;
    private Boolean anulat;
}
