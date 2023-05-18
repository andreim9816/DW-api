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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_plata")
    @SequenceGenerator(sequenceName = "seq_plata", allocationSize = 1, name = "seq_plata")
    @Column(name = "PLATA_ID")
    private Long id;

    @Column(name = "SUMA_TOTALA")
    private Double sumaTotala;

    @Column(name = "DATA_PLATA")
    private Date dataPlata;

    @ManyToOne
    @JoinColumn(name = "METODA_PLATA_ID")
    private MetodaPlata metodaPlata;

    @OneToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "REZERVARE_ID")
    private Rezervare rezervare;
}
