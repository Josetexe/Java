/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglaarrays;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static String pedirNombreAlumno()
    {
        System.out.println ("Introduzca nombre alumno");
        Scanner sc=new Scanner (System.in);
        String n=sc.nextLine();
        return n;
    }
    
    public static void mostrarNombre(String i) 
    {
        System.out.println (i);
    }
}
