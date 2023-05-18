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
@Table(name = "CLIENT")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_client")
    @SequenceGenerator(sequenceName = "seq_client", allocationSize = 1, name = "seq_client")
    @Column(name = "CLIENT_ID")
    private Long id;

    private String nume;

    private String prenume;

    private String email;

    @Column(name = "NUMAR_TELEFON")
    private String numarTelefon;

    @Column(name = "PREMIUM")
    private Boolean premium;

    @Column(name = "DATA_INREGISTRARE")
    private Date dataInregistrare;
}
