package com.example.bankingapi.domain.warehouse;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Date;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class RezervareId implements Serializable {
    private static final long serialVersionUID = -3879046863664637003L;

    @Column(name = "CLIENT_ID")
    private Long clientId;

    @Column(name = "DATA_REZERVARE_ID")
    private Date dataRezervare;

    @Column(name = "DATA_PLECARE_ID")
    private Date dataPlecare;

    @Column(name = "DATA_SOSIRE_ID")
    private Date dataSosire;

    @Column(name = "LOCATIE_PLECARE_ID")
    private String locatiePlecareId;

    @Column(name = "LOCATIE_SOSIRE_ID")
    private String locatieSosireId;

    @Column(name = "OPERATOR_ID")
    private String operatorZborId;

    @Column(name = "ZBOR_ID")
    private Long zborId;

    @Column(name = "CLASA_ZBOR_ID")
    private Long clasaZborId;

    @Column(name = "METODA_PLATA_ID")
    private Long metodaPlataId;

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
