/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoclas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class EntradaSalida {
    public static int pedirOpcion()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("INTRODUZCA UNA OPCIÓN: ");
        System.out.println("1-Introducir ficha trabajador");
        System.out.println("2-Listar trabajadores");
        System.out.println("3-Pintar tabla trabajadores");
        System.out.println("4-Salir");
        int opcion=sc.nextInt();
        return opcion;
    }

    public static Teleoperadores pedirDatosTeleoperador() 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Su nombre, por favor.");
        String nombre=sc.nextLine();
        System.out.println("Y el apellido");
        String apellido=sc.nextLine();
        System.out.println("Digame su edad");
        String edad=sc.nextLine();
        System.out.println("¿Desde cuando esta usted trabajando aqui?");
        String antiguedad=sc.nextLine();
        
        Teleoperadores t=new Teleoperadores (nombre, apellido, edad, antiguedad);
        return t;
    }

    static void mostrarTeleoperadores(ArrayList<Teleoperadores> lista_teleoperadores) {
        for(Teleoperadores m: lista_teleoperadores)
        {
            System.out.println(m);
        }
    }
}
