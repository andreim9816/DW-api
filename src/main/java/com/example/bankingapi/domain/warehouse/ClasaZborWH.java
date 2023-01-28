package com.example.bankingapi.domain.warehouse;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "CLASA_ZBOR")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClasaZborWH {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLASA_ZBOR_ID")
    private Long id;

    private String denumire;

}
