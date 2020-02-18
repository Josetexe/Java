/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoclas;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class ClasePrincipal {
     public static void main(String[] args) {
        int opcion=EntradaSalida.pedirOpcion();//Saca el menú y espera input del usuario
        ArrayList<Teleoperadores> lista_teleoperadores=new ArrayList();
     while(opcion!=4)
     {
                    switch(opcion)
                    {
                        case 1:
                            Teleoperadores m=EntradaSalida.pedirDatosTeleoperador();
                            lista_teleoperadores.add(m);
                            break;
                        case 2:
                            EntradaSalida.mostrarTeleoperadores(lista_teleoperadores);

                            break;
                        case 3: 
                            String html_tabla=PintaHML.crearTabla(lista_teleoperadores);
                            AccesoFichero.grabarLinea(html_tabla, "C:\\Users\\NOX208\\Documents\\archivo.html");
                            break;
                    }
                    opcion=EntradaSalida.pedirOpcion();
     }  
    }
}
