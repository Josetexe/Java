/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomultiplicar;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    final static int JUGAR=1;
    final static int VER_RANKING=2;
    final static int SALIR=3;
    static int pedirOpcion() {
        
        System.out.println(JUGAR+"-Jugar");
        System.out.println(VER_RANKING+"-Ver ranking");
        System.out.println(SALIR+"-Salir");
        Scanner sc=new Scanner(System.in);
        int opcion=sc.nextInt();
        return opcion;
    }
    
    static int preguntarNTabla(){
        System.out.println("Inserte un numero del 1 al 10");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        return n;
    }
    
    static void mostrarJugadores(ArrayList<Persona> lista_personas) {
        for (Persona persona : lista_personas) {
            System.out.println(persona);
        }
    }

    static int preguntarNumero() {
        System.out.println("Inserte el numero de operaciones");
        Scanner sc=new Scanner(System.in);
        int numero_op=sc.nextInt();
        return numero_op;
    }

    static String preguntarNombre() {
        System.out.println("Inserte su nombre");
        Scanner sc=new Scanner(System.in);
        String nombre=sc.nextLine();
        return nombre;
    }

    static int preguntarOperacion(int n, int n_aleatorio) {
        System.out.println(n+" x "+n_aleatorio);
        Scanner sc=new Scanner(System.in);
        int resultado=sc.nextInt();
        return resultado;
    }
    
    
}
