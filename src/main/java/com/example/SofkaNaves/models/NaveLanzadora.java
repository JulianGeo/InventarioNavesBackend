package com.example.SofkaNaves.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="NaveLanzadora")
public class NaveLanzadora extends Nave{

    @Column(name = "CARGA")
    private Integer carga;

    @Column(name = "EMPUJE")
    private Integer empuje;

    @Column(name = "POTENCIA")
    private Integer potencia;

    @Column(name = "REUTILIZABLE")
    private Boolean reuttilizable;

}
