/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.notamedia;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int pedirNotaAlumno(int numero_alumno)
    {
        System.out.println("Indica la nota del alumno "+(numero_alumno+1)) ;
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        return n;
    }

    
    public static void mostrarMedia (double dividir)
    {
        if (dividir>5)
        {
            System.out.println("Has aprobado");
        }
        else
        {
            System.out.println("Has suspendido");
        }
        
        System.out.println("Media: "+dividir);
    }
    
}
