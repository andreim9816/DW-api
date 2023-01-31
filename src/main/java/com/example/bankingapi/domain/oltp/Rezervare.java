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
public class Rezervare {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rezervare_seq")
    @SequenceGenerator(sequenceName = "rezervare_seq", allocationSize = 1, name = "rezervare_seq")
    @Column(name = "REZERVARE_ID")
    private Long id;

    @Column(name = "NR_PASAGERI")
    private Long nrPasageri;

    @Column(name = "NR_PASAGERI_FEMEI")
    private Long nrPasageriFemei;

    @Column(name = "NR_PASAGERI_BARBATI")
    private Long nrPasageriBarbati;

    @Column(name = "DATA_REZERVARE")
    private Date dataRezervare;

    @Column(name = "SUMA_TOTALA")
    private Double sumaTotala;

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "ZBOR_ID")
    private Zbor zbor;

    @ManyToOne
    @JoinColumn(name = "CLASA_ZBOR_ID")
    private ClasaZbor clasaZbor;

    @ManyToOne
    @JoinColumn(name = "METODA_PLATA_ID")
    private MetodaPlata metodaPlata;

}
