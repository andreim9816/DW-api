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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zbor_seq")
    @SequenceGenerator(sequenceName = "zbor_seq", allocationSize = 1, name = "zbor_seq")
    @Column(name = "ZBOR_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OPERATOR_ID")
    private OperatorZbor operatorZbor;

    @Column(name = "AERONAVA_ID")
    private String aeronavaId;

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
