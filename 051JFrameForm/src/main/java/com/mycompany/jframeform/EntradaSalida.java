/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jframeform;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
class EntradaSalida {
    public static String pedirNombre()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre=sc.nextLine();
        return nombre;
        
    }
    
    public static String hacerPreguntas(PreguntaRespuesta c)
    {
        Scanner sc=new Scanner (System.in);
        System.out.println(c.getPregunta());
        String n=sc.nextLine();
        return n;
    }
    public static void mostrarRanking (ArrayList<Ranking> lista_ranking)
    {
        System.out.println(lista_ranking);
    }
}
