package com.example.bankingapi.domain.warehouse;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "TIMP")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimpWH {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TIMP_ID")
    private Date id;

    @Column(name = "ZI_AN")
    private Integer ziAn;

    @Column(name = "ZI_LUNA")
    private Integer ziLuna;

    @Column(name = "ZI_SAPTAMANA")
    private Integer ziSaptamana;

    private Integer luna;

    private Integer an;

    private Boolean weekend;

    private Integer ora;

    private Integer minut;

}
