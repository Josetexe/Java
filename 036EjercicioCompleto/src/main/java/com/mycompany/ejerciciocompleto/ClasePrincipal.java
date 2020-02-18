/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciocompleto;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion_menu=EntradaSalida.mostrarMenu();
        ArrayList<Agenda> lista_contactos=new ArrayList();
        /*String nombre_buscar=EntradaSalida.buscarContacto();*/
    
        while(opcion_menu!=5)
		{
			switch(opcion_menu)
			{
			case 1:
				Agenda a=EntradaSalida.pedirDatosContacto();
                                lista_contactos.add(a);
                                
				break;
			case 2:
				EntradaSalida.mostrarContactos(lista_contactos);
				break;
			
                        case 3: 
                                /*BUSCAR CONTACTOS POR NOMBRE*/
                                String contacto_introducido=EntradaSalida.buscarContacto();
                                boolean existe=false;
                                for (Agenda c: lista_contactos)
                                {
                                    String nombre=c.getNombre();
                                    if (contacto_introducido.equals(nombre))
                                    { existe=true;   System.out.println(c);}
                                    
                                }
                                if(existe==false)
                                {
                                    System.out.println("No existe");
                                }
                               
                                
                                break;
                                
                        case 4:
				String html_tabla=PintaHTML.crearTabla (lista_contactos);
                                GrabarFichero.grabarLinea(html_tabla, "C:\\TextosNetbeans\\fichero.html");
				break;
                          				
					
			}
			opcion_menu=EntradaSalida.mostrarMenu();
		
                }
    }
    
}
