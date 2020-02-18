/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraylistpadrehijoswhile;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class Padre {
    private String nombre;
    private ArrayList<String> hijos;

    public Padre(String nombre, ArrayList<String> hijos) {
        this.nombre = nombre;
        this.hijos = hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombrePadre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getHijos() {
        return hijos;
    }

    public void setHijos(ArrayList<String> hijos) {
        this.hijos = hijos;
    }

    @Override
    public String toString() {
        return "Padre{" + "nombrePadre=" + nombre + ", hijosPadre=" + hijos + '}';
    }
}
