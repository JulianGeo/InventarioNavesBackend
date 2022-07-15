package com.example.SofkaNaves.models;

public abstract class Nave {

    private double peso;
    private double altura;
    private double combustible;
    private double destino;
    private String mision;

    public Nave(double peso, double altura, double combustible, double destino, String mision) {
        this.peso = peso;
        this.altura = altura;
        this.combustible = combustible;
        this.destino = destino;
        this.mision = mision;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getCombustible() {
        return combustible;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }

    public double getDestino() {
        return destino;
    }

    public void setDestino(double destino) {
        this.destino = destino;
    }
}
