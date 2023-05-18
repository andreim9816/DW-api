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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_rezervare")
    @SequenceGenerator(sequenceName = "seq_rezervare", allocationSize = 1, name = "seq_rezervare")
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
    private Client clientNonGDPR;

    @ManyToOne
    @JoinColumn(name = "ZBOR_ID")
    private Zbor zbor;

    @ManyToOne
    @JoinColumn(name = "CLASA_ZBOR_ID")
    private ClasaZbor clasaZbor;

    @OneToOne(mappedBy = "rezervare")
    private Plata plata;
}
