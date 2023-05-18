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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_metoda_plata")
    @SequenceGenerator(sequenceName = "seq_metoda_plata", allocationSize = 1, name = "seq_metoda_plata")
    @Column(name = "METODA_PLATA_ID")
    private Long id;

    private String denumire;

}
