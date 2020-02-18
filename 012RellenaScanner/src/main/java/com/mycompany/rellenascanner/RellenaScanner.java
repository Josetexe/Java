/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rellenascanner;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class RellenaScanner {
    
      public static void main(String[] args) 
      {
        int a=pedirNumero();//Este método pide un número por pantalla y lo devuelve
        int b=pedirNumero();
        String texto_suma=calcularSuma(a, b);//Este método devuelve un String de tipo "La suma de ... y ... es ...".
        
        
        mostrarResultado(texto_suma);//Este método saca por pantalla el texto que se le pasa
        
        
        
      }

      private static int pedirNumero ()
      {
        System.out.println("Por favor escriba un número");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        return n;

      }
     
      private static String calcularSuma (int a, int b) 
      {
        int suma=a+b;
        String texto="La suma de "+a+" y "+b+" es "+suma;
        return texto;
                        
      }
      
     private static void mostrarResultado(String texto)
     {
         System.out.println(texto);
     }
      
}
