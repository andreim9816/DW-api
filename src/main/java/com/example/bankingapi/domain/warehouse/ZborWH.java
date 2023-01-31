package com.example.bankingapi.domain.warehouse;

import com.example.bankingapi.domain.oltp.Destinatie;
import com.example.bankingapi.domain.oltp.OperatorZbor;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ZBOR")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ZborWH {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "zbor_seq")
    @SequenceGenerator(sequenceName = "zbor_seq", allocationSize = 1, name = "zbor_seq")
    @Column(name = "ZBOR_ID")
    private Long id;

    @Column(name = "AERONAVA_ID")
    private String aeronavaId;

    private Integer durata;

    private Integer distanta;

    @Column(name = "TOTAL_LOCURI")
    private Integer totalLocuri;

    private boolean anulat;
}
