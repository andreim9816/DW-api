package com.example.bankingapi.domain.oltp;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "OPERATOR_ZBOR")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OperatorZborOLTP {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "OPERATOR_ID")
    private String id;

    @Column(name = "NUME")
    private String denumire;

}
