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
public class ClasePrincipal {
    public static void main(String[] args) {
        ArrayList<String> hijos_padre1=new ArrayList();
       
        String nombre_padre=EntradaSalida.pedirNombrePadre();
       /* hijos_padre1.add("Ana");
        hijos_padre1.add("Jose");
        hijos_padre1.add("Manuel");*/
        
        int mas_hijos=EntradaSalida.preguntarMasHijos(); //1-Si­ 2-No
        while (mas_hijos!=2)
        {
            String nombre_hijo=EntradaSalida.pedirNombreHijo();
            hijos_padre1.add(nombre_hijo);
            mas_hijos=EntradaSalida.preguntarMasHijos(); 
        }
        
       
        Padre p1=new Padre(nombre_padre, hijos_padre1);
        
        System.out.println("NOMBRE DEL PADRE: "+p1.getNombre());
        for(String x: p1.getHijos())
        {
            System.out.println("Hijo: "+x);
        }
        
    }
}
