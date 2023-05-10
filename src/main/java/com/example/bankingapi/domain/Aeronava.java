package com.example.bankingapi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Aeronava {
    @Id
    @Column(name = "AERONAVA_ID")
    private String id;

    private String producator;

    private String nume;
}
