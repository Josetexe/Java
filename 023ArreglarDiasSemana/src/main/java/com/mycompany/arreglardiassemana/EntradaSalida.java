/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglardiassemana;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int preguntarNumeroDia()
    {
        System.out.println("Digame el dia de la semana en numero");
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        return n;
    }
}
