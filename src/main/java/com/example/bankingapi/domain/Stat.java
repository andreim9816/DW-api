package com.example.bankingapi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Stat {

    @Id
    @Column(name = "STAT_ID")
    private String id;

    @Column(name = "STAT")
    private String nume;
}
