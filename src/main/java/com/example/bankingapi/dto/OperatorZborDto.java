package com.example.bankingapi.dto;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperatorZborDto {
    private String id;
    private String nume;
    private String tip;
}
