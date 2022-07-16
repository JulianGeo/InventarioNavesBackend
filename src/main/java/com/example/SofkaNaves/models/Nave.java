package com.example.SofkaNaves.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

@Data
@NoArgsConstructor
public class Nave implements Serializable {

    private Integer tipoNave;
    private String nombre;
    private Double peso;
    private Double altura;
    private Double combustible;
    private String mision;

}
