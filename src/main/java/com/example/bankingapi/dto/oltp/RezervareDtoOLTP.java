package com.example.bankingapi.dto.oltp;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RezervareDtoOLTP {
    private Long id;
    private Long nrPasageri;
    private Long nrPasageriFemei;
    private Long nrPasageriBarbati;
    private Date dataRezervare;
    private Double sumaTotala;
    private Long clientId;
    private Long zborId;
    private Long clasaZborId;
    private Long metodaPlataId;
}
