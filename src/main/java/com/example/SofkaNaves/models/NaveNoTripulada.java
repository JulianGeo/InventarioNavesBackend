package com.example.SofkaNaves.models;
import javax.persistence.*;

@Entity
@Table(name="NaveNoTripulada")
public class NaveNoTripulada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
