package com.example.bankingapi.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
    private Long id;
    private String nume;
    private String prenume;
    private String email;
    private String numarTelefon;
    private Boolean premium;
    private Date dataInregistrare;
}
