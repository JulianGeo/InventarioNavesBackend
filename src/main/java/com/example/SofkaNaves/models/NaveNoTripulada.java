package com.example.SofkaNaves.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="NaveNoTripulada")
public class NaveNoTripulada extends Nave {

    @Column(name = "DESTINO")
    private String destino;

    @Column(name = "PARA_INVESTIGACION")
    private Boolean paraInvestigacion;

}

