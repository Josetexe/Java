/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciocompleto;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int mostrarMenu()
    {
        System.out.println("1-Insertar contacto");
	System.out.println("2-Listar contacto");
	System.out.println("3-Buscar contacto por nombre");
	System.out.println("4-Guardar contactos introducidos en una tabla");
        System.out.println("5-Salir");
        return (new Scanner(System.in)).nextInt();
    }
    
    public static Agenda pedirDatosContacto()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Indique el nombre del contacto");
        String nombre=sc.nextLine();
        System.out.println("¿Apellidos?");
        String apellidos=sc.nextLine();
        System.out.println("Su e-mail, por favor");
        String email=sc.nextLine();
        Agenda a=new Agenda (nombre, apellidos, email);
        return a;
    }
    
    
    public static void mostrarContactos(ArrayList<Agenda> lista_contactos)
    {
        for (Agenda a : lista_contactos)
        {
            System.out.println(a);
        }
        
    }
    
    public static String buscarContacto()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("¿Qué contacto quiere buscar?");
        String n=sc.nextLine();
        return n;
        
    }
}
