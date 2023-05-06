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
public class Plata {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "plata_seq")
    @SequenceGenerator(sequenceName = "plata_seq", allocationSize = 1, name = "plata_seq")
    @Column(name = "PLATA_ID")
    private Long id;

    private String denumire;

    @Column(name = "SUMA_TOTALA")
    private Double sumaTotala;

    @Column(name = "DATA_PLATA")
    private Date dataPlata;

    @ManyToOne
    @JoinColumn(name = "METODA_PLATA_ID")
    private MetodaPlata metodaPlata;

    @OneToOne(mappedBy = "plata")
    private Rezervare rezervare;
}
