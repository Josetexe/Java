/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegometodosclases;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int pedirNumero ()
    {
        System.out.println("Introduzca un numero");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        return n;
    }
            
            
}
