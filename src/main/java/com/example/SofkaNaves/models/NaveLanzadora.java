package com.example.SofkaNaves.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name="NaveLanzadora")
public class NaveLanzadora extends Nave{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;

    @Column(name = "CARGA")
    private Integer carga;

    @Column(name = "EMPUJE")
    private Integer empuje;

    @Column(name = "POTENCIA")
    private Integer potencia;

}
