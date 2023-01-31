package com.example.bankingapi.domain.oltp;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "client_seq")
    @SequenceGenerator(sequenceName = "client_seq", allocationSize = 1, name = "client_seq")
    @Column(name = "CLIENT_ID")
    private Long id;

    private String nume;

    private String prenume;

    private String email;

    @Column(name = "NUMAR_TELEFON")
    private String numarTelefon;


}
