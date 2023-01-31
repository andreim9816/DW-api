package com.example.bankingapi.domain.warehouse;

import com.example.bankingapi.domain.oltp.Zbor;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "REZERVARE")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RezervareWH {

    @EmbeddedId
    private RezervareId id;

    @Column(name = "NR_PASAGERI")
    private Integer nrPasageri;

    @Column(name = "NR_PASAGERI_FEMEI")
    private Integer nrPasageriFemei;

    @Column(name = "NR_PASAGERI_BARBATI")
    private Integer nrPasageriBarbati;

    @Column(name = "SUMA_TOTALA")
    private Double sumaTotala;

//    @Column(name = "CLIENT_ID")
//    private Long clientId;
//
//    @ManyToOne
//    @JoinColumn(name = "DATA_REZERVARE_ID")
//    TimpWH dataRezervare;
//
//    @ManyToOne
//    @JoinColumn(name = "DATA_PLECARE_ID")
//    TimpWH dataPlecare;
//
//    @ManyToOne
//    @JoinColumn(name = "DATA_SOSIRE_ID")
//    TimpWH dataSosire;
//
//    @ManyToOne
//    @JoinColumn(name = "LOCATIE_PLECARE_ID")
//    Destinatie locatiePlecare;
//
//    @ManyToOne
//    @JoinColumn(name = "LOCATIE_SOSIRE_ID")
//    Destinatie locatieSosire;
//
//    @ManyToOne
//    @JoinColumn(name = "OPERATOR_ID")
//    OperatorZbor operatorZbor;
//
//    @ManyToOne
//    @JoinColumn(name = "ZBOR_ID")
//    ZborWH zbor;
//
//    @ManyToOne
//    @JoinColumn(name = "CLASA_ZBOR_ID")
//    ClasaZbor clasaZbor;
//
//    @ManyToOne
//    @JoinColumn(name = "METODA_PLATA_ID")
//    MetodaPlata metodaPlata;
}
