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
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clasa_zbor_seq")
    @SequenceGenerator(sequenceName = "clasa_zbor_seq", allocationSize = 1, name = "clasa_zbor_seq")
    @Column(name = "CLASA_ZBOR_ID")
    private Long id;

    private String denumire;

}
