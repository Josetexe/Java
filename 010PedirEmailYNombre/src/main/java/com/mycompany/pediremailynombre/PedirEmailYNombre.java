/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pediremailynombre;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class PedirEmailYNombre {
    public static void main(String[] args) {
        String a=preguntarNombre();
        String b=preguntarEmail();
        
        System.out.println("Su nombre es: "+a+", y su E-mail es: "+b);
    }
    public static String preguntarNombre()
    {
        System.out.println("Por favor escriba su nombre");
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        return n;
    }
    
    public static String preguntarEmail()
    {
        System.out.println("Por favor escriba su Email");
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        return n;
    }
}
