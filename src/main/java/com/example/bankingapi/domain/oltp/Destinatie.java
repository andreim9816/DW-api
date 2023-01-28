package com.example.bankingapi.domain.oltp;

import lombok.*;

import javax.persistence.*;

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
