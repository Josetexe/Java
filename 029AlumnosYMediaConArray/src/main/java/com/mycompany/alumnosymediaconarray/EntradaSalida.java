/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alumnosymediaconarray;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int pedirNumeroAlumnos()
    {
        System.out.println("Indique el numero de alumnos a introducir");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        return n;
    }
    
    public static Alumnos pedirDatosAlumnos()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Introduzca el nombre del alumno");
        String nombre=sc.nextLine();
        System.out.println("Ahora la nota de la asignatura de programación");
        float nota=sc.nextFloat();
        
        Alumnos a=new Alumnos (nombre, nota);
        return a;
    }
    
    public static void mostrarAlumnos(ArrayList<Alumnos> Lista_alumnos)
    {
        for (Alumnos a : Lista_alumnos)
        {
            System.out.println("Los alumnos de programacion son: "+a);
        }
    }
    
    public static void mostrarMedia (float media)
    {
        System.out.println("Media: "+media);
    }
    
    
    
    
}
