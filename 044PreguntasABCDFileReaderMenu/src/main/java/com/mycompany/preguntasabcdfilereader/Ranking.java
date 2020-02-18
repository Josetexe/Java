/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntasabcdfilereader;

/**
 *
 * @author CDMFP
 */
public class Ranking {
     private String nombre;
    private int puntuacion;

    public Ranking(String nombre, int puntuacion) {
        this.nombre = nombre;
        this.puntuacion = puntuacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        String texto="\n" + "Ranking: " + "nombre=" + nombre + " puntuacion=" + puntuacion + "\n";
        return texto;
    }
}
