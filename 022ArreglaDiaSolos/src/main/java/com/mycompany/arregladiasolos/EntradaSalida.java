/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arregladiasolos;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static String preguntarNombre()
    {
        System.out.println("Digame su nombre");
        Scanner sc=new Scanner (System.in);
        String n=sc.nextLine();
        return n;
    }
    
    public static int preguntarEdad()
    {
        System.out.println("Digame su edad");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        return n;
    }
}
