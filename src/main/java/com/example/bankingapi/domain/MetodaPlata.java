package com.example.bankingapi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "METODA_PLATA")
public class MetodaPlata {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "metoda_plata_seq")
    @SequenceGenerator(sequenceName = "metoda_plata_seq", allocationSize = 1, name = "metoda_plata_seq")
    @Column(name = "METODA_PLATA_ID")
    private Long id;

    private String denumire;

}
