package com.example.bankingapi.domain;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CLIENT_NONGDPR")
public class ClientNonGDPR {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    @SequenceGenerator(sequenceName = "client_seq", allocationSize = 1, name = "client_seq")
    @Column(name = "CLIENT_ID")
    private Long id;

    @Column(name = "PREMIUM")
    private Boolean isPremium;

    @Column(name = "DATA_INREGISTRARE")
    private Date dataInregistrare;
}
