/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pedirnombreyedad;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class PedirNombreYEdad {
    public static void main(String[] args) {
        String d=preguntarNombre();
        int b=preguntarAnyoNacimiento();
        int a=preguntarAnyoActual();
        int c=edad(a, b);
        
        
        System.out.println("Hola "+d+" su edad es: "+c);
    }
    
    public static int preguntarAnyoActual()
    {
        System.out.println("Por favor escriba año actual");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        return n;
    }
    
    public static int preguntarAnyoNacimiento()
    {
        System.out.println("Por favor escriba su año de nacimiento");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        return n;
    }
    
    public static int edad (int a, int b) 
    {
        int edad=a-b;
        return edad;
    }
    
    public static String preguntarNombre()
    {
        System.out.println("Por favor escriba su nombre");
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        return n;
    }
    
}
