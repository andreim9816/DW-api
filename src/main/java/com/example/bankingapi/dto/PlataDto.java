package com.example.bankingapi.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlataDto {
    private Long id;
    private Double sumaTotala;
    private Date dataPlata;
    private Long metodaPlataId;
    private Long rezervareId;
}
