package com.example.bankingapi.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZborDto {
    private Long id;
    private String operatorId;
    private String aeronavaId;
    private Integer durata;
    private Integer distanta;
    private Integer totalLocuri;
    private Boolean anulat;
    private Date dataPlecare;
    private Date dataSosire;
    private String locatiePlecareId;
    private String locatieSosireId;
}
