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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aeronava_seq")
    @SequenceGenerator(sequenceName = "aeronava_seq", allocationSize = 1, name = "aeronava_seq")
    @Column(name = "AERONAVA_ID")
    private Long id;

    private String nume;
}
