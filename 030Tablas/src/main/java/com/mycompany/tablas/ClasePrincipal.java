/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablas;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
		int opcion_menu=EntradaSalida.mostrarMenu();
                ArrayList<Moto> lista_motos=new ArrayList();
		//4-Salir
		while(opcion_menu!=4)
		{
			switch(opcion_menu)
			{
			case 1:
				Moto a=EntradaSalida.pedirDatosMoto();
                                lista_motos.add(a);
                                
				break;
			case 2:
				EntradaSalida.mostrarMotos(lista_motos);
				break;
			
                        case 3:
				String html_tabla=PintaHTML.crearTabla (lista_motos);
                                GrabarFichero.grabarLinea(html_tabla, "C:\\taller\\fichero.html");
				break;
				
					
			}
			opcion_menu=EntradaSalida.mostrarMenu();
		
                }
		
	}
}

    

