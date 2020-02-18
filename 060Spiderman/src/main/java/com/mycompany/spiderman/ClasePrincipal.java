/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spiderman;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int num_posibilidades=EntradaSalida.pedirOpciones();
        
        
        
        //0-Spidermam 1-BombaA 2-BombaB
        
        
        for(int i=0;i<num_posibilidades;i++)
        {
            String distancias=EntradaSalida.pedirDistancias();
            String[] distancias_separadas=distancias.split(" ");
                        
            int s=Integer.parseInt(distancias_separadas[0]);
            int a=Integer.parseInt(distancias_separadas[1]);
            int b=Integer.parseInt(distancias_separadas[2]);
            
            int ab=Math.abs(a-b);
            int sa=Math.abs(s-a);
            int sb=Math.abs(s-b);
            
            int camino1=ab+sa;
            int camino2=ab+sb;
            
            if(camino1<camino2)
            {
                System.out.println("El camino mas corto es: "+camino1);
            }
            else
            {
                System.out.println("El camino mas corto es: "+camino2);
            }
            
            
            //System.out.println(camino1+" -- "+camino2);
            
        }
        
        
        
    }
}
