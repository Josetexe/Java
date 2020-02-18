/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglamotos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
     public static int pedirNumeroMotos()
    {
        System.out.println("Digame el numero de motos.");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        return n;
    }
    
    public static Moto pedirDatosMoto()
    {
       Scanner sc=new Scanner (System.in);
       System.out.println("Indique la marca.");
       String marca=sc.nextLine();
       System.out.println("Ahora el modelo.");
       String modelo=sc.nextLine();
       System.out.println("Por utlimo, introduzca la matricula.");
       String matricula=sc.nextLine();
       
       Moto m=new Moto (marca, modelo, matricula);
       return m;
    } 
    
     public static void mostrarMotos (ArrayList<Moto> lista_motos) 
      {
      /*for (Moto m : lista_motos)
      {
             System.out.println("Las motos introducidas son: "+m);
      }
      */
      for (int i=0; i<lista_motos.size(); i++)
      {
          Moto x=lista_motos.get(i);
          System.out.println("MOTO: "+x);
      }
      
      
      }
      
     
}

