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
public class ClasePrincipal {
    public static void main(String[] args) {
        ArrayList<Hijos> hijos=new ArrayList();
        
        String nombre_padre=EntradaSalida.pedirNombrePadre();
        int numero_hijos=EntradaSalida.pedirNumeroHijos();
            while(numero_hijos!=2)
            {
                String nombre_hijo=EntradaSalida.pedirNombreHijo();
                
                int edad_hijo=EntradaSalida.pedirEdadHijo();
                
                Hijos h1=new Hijos (nombre_hijo, edad_hijo);
                hijos.add(h1);
                
                numero_hijos=EntradaSalida.pedirNumeroHijos();
            }
        
        
        Padre p1=new Padre (nombre_padre, hijos);
        
        System.out.println("Nombre del padre: "+p1.getPadre());
            for (Hijos x : p1.getHijos())
            {
                System.out.println("Hijo: "+x);
            }
        
    }
}
