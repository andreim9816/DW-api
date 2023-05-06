package com.example.bankingapi.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Stat {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stat_seq")
    @SequenceGenerator(sequenceName = "stat_seq", allocationSize = 1, name = "stat_seq")
    @Column(name = "STAT_ID")
    private Long id;

    private String nume;

    @OneToMany
    List<Destinatie> destinatii;
}
