/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegocolonprofe;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
class EntradaSalida {
    
    public static int pedirMenu(){
          Scanner sc=new Scanner(System.in);
          System.out.println("1. Concursar");
          System.out.println("2. Ranking de Ganadores");
          System.out.println("3. Salir");
          return (new Scanner(System.in)).nextInt();
      }
    public static String pedirNombre()
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre=sc.nextLine();
        return nombre;
        
    }
    public static String hacerPregunta(Pregunta p)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(p.getPregunta());
        String resp=sc.nextLine();
        return resp;
    }
    
    public static void mostrarRanking (ArrayList<Ranking> lista_ranking)
    {
        System.out.println(lista_ranking);
    }
}
