package com.example.SofkaNaves.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="NaveTripulada")
public class NaveTripulada extends Nave {

    @Column(name = "CAPACIDAD")
    private Integer capacidad;

    @Column(name = "DURACION_MOUNTH")
    private Integer duracionMouth;

    @Column(name = "DURACION_YEAR")
    private Integer duracionYear;

}
