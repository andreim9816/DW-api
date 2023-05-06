package com.example.bankingapi.domain;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OPERATOR_ZBOR")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperatorZbor {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OPERATOR_ID")
    private String id;

    @Column(name = "NUME")
    private String denumire;

    @Column(name = "LOW_COST")
    private Boolean isLowCost;

}
