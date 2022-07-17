package com.example.SofkaNaves.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@Entity
@Table(name="NaveDetalle")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Nave implements Serializable {

    private static final long serialVersionUID = 5762495204643934577L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer tipoNave;
    private String nombre;
    private Double peso;
    private Double altura;
    private Double combustible;
    private String mision;



}
