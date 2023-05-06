package com.example.bankingapi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Destinatie {

    @Id
    @Column(name = "DESTINATIE_ID")
    private String id;

    private String oras;

    @ManyToOne
    @JoinColumn(name = "STAT_ID")
    private Stat stat;
}
