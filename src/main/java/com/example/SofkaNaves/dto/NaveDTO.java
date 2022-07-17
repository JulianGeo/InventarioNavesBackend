package com.example.SofkaNaves.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class NaveDTO implements Serializable {

    private static final long serialVersionUID = 9067260639099148512L;

    /**
     * Propiedades comunes de todas las naves
     **/
    private Long id;

    private Integer tipoNave;
    private String nombre;
    private Double peso;
    private Double altura;
    private Double combustible;
    private String mision;

    /**
     * Propiedades particulares naves LANZADORA
     **/
    private Integer carga;
    private Integer empuje;
    private Integer potencia;
    private Boolean reuttilizable;

    /**
     * Propiedades particulares naves NO TRIPULADAS
     **/
    private String destino;
    private Boolean paraInvestigacion;

    /**
     * Propiedades particulares naves TRIPULADAS
     **/
    private Integer capacidad;
    private Integer duracionMouth;
    private Integer duracionYear;


}
