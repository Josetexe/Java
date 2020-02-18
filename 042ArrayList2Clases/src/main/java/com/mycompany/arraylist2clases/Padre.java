/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraylist2clases;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class Padre {
    private String padre;
    private ArrayList <Hijos> Hijos;

    public Padre(String padre, ArrayList<Hijos> Hijos) {
        this.padre = padre;
        this.Hijos = Hijos;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public ArrayList<Hijos> getHijos() {
        return Hijos;
    }

    public void setHijos(ArrayList<Hijos> Hijos) {
        this.Hijos = Hijos;
    }

    @Override
    public String toString() {
        return "Padre{" + "padre=" + padre + ", Hijos=" + Hijos + '}';
    }
    
    
}
