/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentacorriente;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {

    public static int pedirMenu() {
    
        System.out.println("1. Crear cuenta corriente");
        System.out.println("2. Gastar 10€");
        System.out.println("3. Ingresar 10€");
        System.out.println("4. Ingresar una cantidad");
        System.out.println("5. Gastar una cantidad");
        System.out.println("6. Ver saldo");
        System.out.println("7. Salir");
        return (new Scanner(System.in)).nextInt();
    }
    
    public static String ingresarPersona()
    {
        System.out.println("Introduzca su nombre");
        Scanner sc=new Scanner (System.in);
        String nombre=sc.nextLine();
        return nombre;
    }
    public static int saldoInicial()
    {
        System.out.println("Introduzca saldo");
        Scanner sc=new Scanner (System.in);
        int nombre=sc.nextInt();
        return nombre;
    }
    
    public static int ingresarx()
    {
        System.out.println("¿Cuanto quiere ingresar?");
        Scanner sc=new Scanner (System.in);
        int ingresarx=sc.nextInt();
        return ingresarx;
    }
    
    public static int gastarx()
    {
        System.out.println("¿Cuanto quiere gastar?");
        Scanner sc=new Scanner (System.in);
        int gastarx=sc.nextInt();
        return gastarx;
    }
    
    
   
    
    
}
