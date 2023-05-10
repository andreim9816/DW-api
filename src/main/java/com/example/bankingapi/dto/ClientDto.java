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
    private Boolean premium;
    private Date dataInregistrare;
}
