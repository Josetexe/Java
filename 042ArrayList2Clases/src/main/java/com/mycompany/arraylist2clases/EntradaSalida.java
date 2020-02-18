/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arraylist2clases;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static String pedirNombrePadre()
    {
        System.out.println("Introduzca el nombre del padre");
        Scanner sc=new Scanner (System.in);
        String opcion=sc.nextLine();
        return opcion;
    }
    public static int pedirNumeroHijos()
    {
        System.out.println("¿Tiene más hijos?");
        System.out.println("1-Si");
        System.out.println("2-No");
        Scanner sc=new Scanner (System.in);
        int opcion=sc.nextInt();
        return opcion;
    }
    public static String pedirNombreHijo()
    {
        System.out.println("Introduzca el nombre del hijo");
        Scanner sc=new Scanner (System.in);
        String opcion=sc.nextLine();
        return opcion;
    }
    public static int pedirEdadHijo()
    {
        System.out.println("¿Cuántos años tiene?");
        Scanner sc=new Scanner (System.in);
        int opcion=sc.nextInt();
        return opcion;
    }
}
