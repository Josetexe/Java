/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cochegrabar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static Coche pedirDatos()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduzca la marca del coche");
        String marca=sc.nextLine();
        System.out.println("Introduzca el modelo del coche");
        String modelo=sc.nextLine();
        System.out.println("Introduzca la potencia del coche");
        int potencia=sc.nextInt();
        
        Coche c=new Coche (marca, modelo, potencia);
        return c;  
    }
    
   /* CON ARRAYLIST 
    
    public static void mostrarCoche (ArrayList<Coche> lista_coches)
    {
        for (Coche a : lista_coches)
        {
            System.out.println(a);
        }
    }*/
}
