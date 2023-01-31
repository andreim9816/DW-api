package com.example.bankingapi.dto.warehouse;

import lombok.*;

import javax.persistence.Column;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TimpDtoWH {

    private Date id;

    private Integer ziAn;

    private Integer ziLuna;

    private Integer ziSaptamana;

    private Integer luna;

    private Integer an;

    private Boolean weekend;

    private Integer ora;

    private Integer minut;
}
