/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alumnosymediaconarray;

/**
 *
 * @author CDMFP
 */
public class Alumnos {
    private String nombre;
    private float nota;

    public Alumnos(String nombre, float nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
}
