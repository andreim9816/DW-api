package com.example.bankingapi.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDatePersonaleDto {
    private Long id;
    private String nume;
    private String prenume;
    private String email;
    private String numarTelefon;
}
