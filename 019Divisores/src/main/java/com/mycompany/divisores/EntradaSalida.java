/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.divisores;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int pedirNumero()
    {
        System.out.println("Diga un numero del que sacar los divisores");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        return n;
    }
   
    public static void mostrarDivisores(int n, int numero_elegido)
    {
        System.out.println("Los divisores de "+numero_elegido+" son: "+n);
    }
    
}
