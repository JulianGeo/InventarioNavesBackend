package com.example.SofkaNaves.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="NaveTripulada")
public class NaveTripulada extends Nave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Column(name = "CAPACIDAD")
    private Integer capacidad;

}
