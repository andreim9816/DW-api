package com.example.bankingapi.domain.warehouse;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperatorZborWH {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OPERATOR_ID")
    private Long id;

    private String denumire;

}
