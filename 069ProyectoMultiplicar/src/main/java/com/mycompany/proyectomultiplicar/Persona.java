/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomultiplicar;

/**
 *
 * @author CDMFP
 */
public class Persona {
    private String nombre;
    private double puntuacion;

    public Persona(String nombre, double puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + '}';
    }
    
}
