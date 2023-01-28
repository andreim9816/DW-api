package com.example.bankingapi.domain.oltp;

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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ZBOR_ID")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "OPERATOR_ID")
    private OperatorZborOLTP operatorZbor;

    @ManyToOne
    @JoinColumn(name = "LOCATIE_PLECARE_ID")
    private Destinatie destinatiePlecare;

    @ManyToOne
    @JoinColumn(name = "LOCATIE_SOSIRE_ID")
    private Destinatie destinatieSosire;

    private Double durata;

    @Column(name = "DATA_PLECARE")
    private Date dataPlecare;

    @Column(name = "DATA_SOSIRE")
    private Date dataSosire;
}
