/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cochegrabar;

/**
 *
 * @author CDMFP
 */
public class Coche {
    private String marca;
    private String modelo;
    private int potencia;

    public Coche(String marca, String modelo, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", potencia=" + potencia + '}';
    }
    
}
