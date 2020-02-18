/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crearmetodos;

/**
 *
 * @author CDMFP
 */
public class Coche {
    private String marca;
    private String modelo;
    private int cc;
    private int cv;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCc() {
        return cc;
    }

    public int getCv() {
        return cv;
    }
    
    
}
