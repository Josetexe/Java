/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static int mostrarMenu()
    {
	System.out.println("1-Insertar moto");
	System.out.println("2-Listar motos");
	System.out.println("3-Crear tabla con las motos");
	System.out.println("4-Salir");
	return (new Scanner(System.in)).nextInt();
    }
    
    public static Moto pedirDatosMoto()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Indique la marca de la moto");
        String marca=sc.nextLine();
        System.out.println("¿Cuál es el modelo?");
        String modelo=sc.nextLine();
        System.out.println("Por ultimo, ¿qué matricula tiene?");
        String matricula=sc.nextLine();
        Moto m=new Moto (marca, modelo, matricula);
        return m;
    }
    
    public static void mostrarMotos(ArrayList<Moto> lista_motos)
    {
        for (Moto a : lista_motos)
        {
            System.out.println(a);
        }
        
    }
    
}
