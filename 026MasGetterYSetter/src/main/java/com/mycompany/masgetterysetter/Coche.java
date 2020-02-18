/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.masgetterysetter;

/**
 *
 * @author CDMFP
 */
public class Coche {
    private String marca, modelo, color, matricula;
    private int potencia;

    public Coche(String marca, String modelo, String color, String matricula, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.potencia = potencia;
    }

    
    
    public void setMarca(String marca) 
    {
        this.marca = marca;
    }
    
    public void setModelo (String modelo)
    {
        this.modelo = modelo;
    }
    
    public void setColor (String color)
    {
        this.color = color;
    }
    
    public void setMatricula (String matricula)
    {
        this.matricula = matricula;
    }
    
    public void setPotencia (int potencia)
    {
        this.potencia = potencia;
    }

    
    
    //Getter
        
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getPotencia() {
        return potencia;
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", matricula=" + matricula + ", potencia=" + potencia + '}';
    }

    
    
    




}
