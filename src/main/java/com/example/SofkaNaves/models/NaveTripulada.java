package com.example.SofkaNaves.models;

import javax.persistence.*;

@Entity
@Table(name="NaveTripulada")
public class NaveTripulada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    //Capacidad de pasajeros
    private String capacidad;

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
