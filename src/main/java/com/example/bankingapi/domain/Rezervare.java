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

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID")
    private ClientDatePersonale clientDatePersonale;

    @ManyToOne
    @JoinColumn(name = "ZBOR_ID")
    private Zbor zbor;

    @ManyToOne
    @JoinColumn(name = "CLASA_ZBOR_ID")
    private ClasaZbor clasaZbor;

    @ManyToOne
    @JoinColumn(name = "METODA_PLATA_ID")
    private MetodaPlata metodaPlata;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PLATA_ID")
    private Plata plata;

}
