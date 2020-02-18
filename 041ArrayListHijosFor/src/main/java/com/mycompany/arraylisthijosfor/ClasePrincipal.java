/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraylisthijosfor;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
     public static void main(String[] args) {
        ArrayList<String> hijos_padre1=new ArrayList();
       
        String nombre_padre=EntradaSalida.pedirNombrePadre();
       /* hijos_padre1.add("Ana");
        hijos_padre1.add("Jose");
        hijos_padre1.add("Manuel");*/
       
       int numero_hijos=EntradaSalida.preguntarNumeroHijos();
              
       for (int i=0; i<numero_hijos; i++)
        {
            String nombre_hijo=EntradaSalida.pedirNombreHijo();
            hijos_padre1.add(nombre_hijo);
        }
        
        Padre p1=new Padre(nombre_padre, hijos_padre1);
        
        System.out.println("NOMBRE DEL PADRE: "+p1.getNombre());
        for(String x: p1.getHijos())
        {
            System.out.println("Hijo: "+x);
        }
        
    }
}
