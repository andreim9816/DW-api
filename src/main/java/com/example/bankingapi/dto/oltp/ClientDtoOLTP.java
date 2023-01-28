package com.example.bankingapi.dto.oltp;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDtoOLTP {
    private Long id;
    private String nume;
    private String prenume;
    private String email;
    private String numarTelefon;
}
