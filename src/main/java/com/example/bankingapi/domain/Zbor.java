package com.example.bankingapi.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Zbor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_zbor")
    @SequenceGenerator(sequenceName = "seq_zbor", allocationSize = 1, name = "seq_zbor")
    @Column(name = "ZBOR_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OPERATOR_ID")
    private OperatorZbor operatorZbor;

    @ManyToOne
    @JoinColumn(name = "AERONAVA_ID")
    private Aeronava aeronava;

    private Integer durata;

    private Integer distanta;

    @Column(name = "TOTAL_LOCURI")
    private Integer totalLocuri;

    private boolean anulat;

    @Column(name = "DATA_PLECARE")
    private Date dataPlecare;

    @Column(name = "DATA_SOSIRE")
    private Date dataSosire;

    @ManyToOne
    @JoinColumn(name = "LOCATIE_PLECARE_ID")
    private Destinatie locatiePlecare;

    @ManyToOne
    @JoinColumn(name = "LOCATIE_SOSIRE_ID")
    private Destinatie locatieSosire;
}
