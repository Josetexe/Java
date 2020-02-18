/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aarreglarentornodesarrollo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {

	public static Contacto pedirDatosContacto() {
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Cómo se llama el contacto?");
		String nombre=sc.nextLine();
		System.out.println("¿Cual es el email del contacto?");
		String email=sc.nextLine();
		System.out.println("¿Cual es el teléfono del contacto?");
		String telefono=sc.nextLine();
		//Normalmente se usa el constructor con argumentos
		Contacto c=new Contacto(nombre, email, telefono);
		/*Contacto c=new Contacto();
		c.setNombre(nombre);
		c.setTelefono(telefono);
		c.setEmail(email);*/
		return c;
	}

	public static int mostrarMenu() {
		System.out.println("1-Insertar contacto");
		System.out.println("2-Listar contactos");
		System.out.println("3-Buscar contacto por nombre");
		System.out.println("4-Salir");
		return (new Scanner(System.in)).nextInt();
		
	}

	public static void mostrarContactos(ArrayList<Contacto> lista_contactos) {
		for (Contacto c : lista_contactos) {
			System.out.println(c);
		}
		
	}

	public static String pedirNombreBuscado() {
		System.out.println("Introduzca el nombre del contacto buscado");
		Scanner sc=new Scanner(System.in);
		String nombre=sc.nextLine();
		return nombre;
	}

}

