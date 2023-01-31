package com.example.bankingapi.dto.oltp;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DestinatieDtoOLTP {
    private String id;
    private String oras;
    private String stat;
}
