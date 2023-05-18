package com.example.bankingapi.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RezervareDto {
    private Long id;
    private Long nrPasageri;
    private Long nrPasageriFemei;
    private Long nrPasageriBarbati;
    private Date dataRezervare;
    private Long clientId;
    private Long zborId;
    private Long clasaZborId;
}
