package com.example.bankingapi.domain.warehouse;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Destinatie {

    @Id
    @Column(name = "DESTINATIE_ID")
    private String id;

    private String oras;

    private String stat;
}
