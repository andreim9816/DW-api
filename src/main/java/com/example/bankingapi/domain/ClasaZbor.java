package com.example.bankingapi.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "CLASA_ZBOR")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClasaZbor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_clasa_zbor")
    @SequenceGenerator(sequenceName = "seq_clasa_zbor", allocationSize = 1, name = "seq_clasa_zbor")
    @Column(name = "CLASA_ZBOR_ID")
    private Long id;

    private String denumire;

}
