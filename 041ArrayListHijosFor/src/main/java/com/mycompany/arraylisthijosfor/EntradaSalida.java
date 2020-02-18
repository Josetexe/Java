/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraylisthijosfor;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int preguntarMasHijos()
    {
        System.out.println("Â¿Tiene hijos?");
        Scanner sc=new Scanner (System.in);
        System.out.println("1-SI");
        System.out.println("2-NO");
        int opcion=sc.nextInt();
        return opcion;
    }
    public static String pedirNombreHijo()
    {
         System.out.println("Â¿Cual es el nombre del hijo?");
         Scanner sc=new Scanner (System.in);
         String opcion=sc.nextLine();
         return opcion;
    }
    
    public static String pedirNombrePadre()
    {
         System.out.println("Â¿Cual es el nombre del padre?");
         Scanner sc=new Scanner (System.in);
         String opcion=sc.nextLine();
         return opcion;
    }
    public static int preguntarNumeroHijos()
    {
        System.out.println("Â¿Cuantos hijos tiene?");
        Scanner sc=new Scanner (System.in);
        int opcion=sc.nextInt();
        return opcion;
    }
}

