package com.example.bankingapi.dto.warehouse;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RezervareDtoWH {
    private Integer nrPasageri;
    private Integer nrPasageriFemei;
    private Integer nrPasageriBarbati;
    private Double sumaTotala;
    private Long clientId;
    private Date dataRezervareId;
    private Date dataSosireId;
    private Date dataPlecareId;
    private String locatiePlecareId;
    private String locatieSosireId;
    private String operatorZborId;
    private Long zborId;
    private Long clasaZborId;
    private Long metodaPlataId;
}
