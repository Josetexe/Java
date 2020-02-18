/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.aarreglarentornodesarrollo;

import java.util.ArrayList;


public class ClasePrincipal {

	public static void main(String[] args) {
		int opcion_menu=EntradaSalida.mostrarMenu();
		//4-Salir
		while(opcion_menu!=4)
		{
			switch(opcion_menu)
			{
			case 1:
				Contacto c=EntradaSalida.pedirDatosContacto();
				AccesoFichero.grabarContacto(c);
				break;
			case 2:
				ArrayList<Contacto> lista_contactos=AccesoFichero.recuperarContactos();
				EntradaSalida.mostrarContactos(lista_contactos);
				break;
			case 3:
				ArrayList<Contacto> lista_contactos2=AccesoFichero.recuperarContactos();
				String nombre_buscado=EntradaSalida.pedirNombreBuscado();
				ArrayList<Contacto> lista_buscados=AccesoFichero.buscarPorNombre(lista_contactos2, nombre_buscado);
				EntradaSalida.mostrarContactos(lista_buscados);
				break;
				
					
			}
			opcion_menu=EntradaSalida.mostrarMenu();
		}
		
	}

}