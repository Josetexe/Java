/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntasabcd;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int pedirMenu()
    {
        System.out.println("1-Jugar");
        System.out.println("2-Ver ranking");
        System.out.println("3-Salir");
        Scanner sc=new Scanner(System.in);
        int opcion=sc.nextInt();
        return opcion;
    }
    public static String pedirNombre()
    {
        System.out.println("Indique su nombre");
        Scanner sc=new Scanner (System.in);
        String opcion=sc.nextLine();
        return opcion;
    }

    public static int hacerPregunta(Preguntas p) 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println(p);
        int n=sc.nextInt();
        return n;
    }
}
