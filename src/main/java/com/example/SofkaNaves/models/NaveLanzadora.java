package com.example.SofkaNaves.models;


import javax.persistence.*;

@Entity
@Table(name="NaveLanzadora")
public class NaveLanzadora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Integer id;
    private int carga;
    private int empuje;
    private int potencia;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public int getEmpuje() {
        return empuje;
    }

    public void setEmpuje(int empuje) {
        this.empuje = empuje;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
