/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoclas;

/**
 *
 * @author Alex
 */
public class Teleoperadores {
    private String nombre;
    private String apellido;
    private String edad;
    private String antiguedad;

    public Teleoperadores(String nombre, String apellido, String edad, String antiguedad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.antiguedad = antiguedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(String antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        return "Teleoperadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", antiguedad=" + antiguedad + '}';
    }
    
    
    
}
