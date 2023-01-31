package com.example.bankingapi.domain.warehouse;

import lombok.*;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class RezervareId implements Serializable {
    private static final long serialVersionUID = -3879046863664637003L;

    @ManyToOne
    @JoinColumn(name = "DATA_REZERVARE_ID")
    TimpWH dataRezervare;

    @ManyToOne
    @JoinColumn(name = "DATA_PLECARE_ID")
    TimpWH dataPlecare;

    @ManyToOne
    @JoinColumn(name = "DATA_SOSIRE_ID")
    TimpWH dataSosire;

    @ManyToOne
    @JoinColumn(name = "LOCATIE_PLECARE_ID")
    Destinatie locatiePlecare;

    @ManyToOne
    @JoinColumn(name = "LOCATIE_SOSIRE_ID")
    Destinatie locatieSosire;

    @ManyToOne
    @JoinColumn(name = "OPERATOR_ID")
    OperatorZbor operatorZbor;

    @ManyToOne
    @JoinColumn(name = "ZBOR_ID")
    ZborWH zbor;

    @ManyToOne
    @JoinColumn(name = "CLASA_ZBOR_ID")
    ClasaZbor clasaZbor;

    @ManyToOne
    @JoinColumn(name = "METODA_PLATA_ID")
    MetodaPlata metodaPlata;
}
