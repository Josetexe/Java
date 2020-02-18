/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.spiderman;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int pedirOpciones()
    {
        System.out.println("¿Cuantas opciones va a probar?");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }
    
    public static String pedirDistancias()
    {
        System.out.println("Indique las tres distancias");
        Scanner sc=new Scanner(System.in);
        String d=sc.nextLine();
        return d;
    }
}
