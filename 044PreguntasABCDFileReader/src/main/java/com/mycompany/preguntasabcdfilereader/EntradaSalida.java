/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntasabcdfilereader;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
       public static int hacerPregunta() 
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("");
        int n=sc.nextInt();
        return n;
    }
    
    public static String pedirNombre()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre=sc.nextLine();
        return nombre;
        
    }
    
    public static void mostrarRanking (ArrayList<Ranking> lista_ranking)
    {
        System.out.println(lista_ranking);
    }
    
    public static int hacerPreguntas(Contacto c)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println(c.getPregunta());
        System.out.println("1-"+c.getRespuesta1());
        System.out.println("2-"+c.getRespuesta2());
        System.out.println("3-"+c.getRespuesta3());
        System.out.println("4-"+c.getRespuesta4());
        int n=sc.nextInt();
        return n;
    }
}

