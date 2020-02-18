/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cochegrabar;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Coche m=EntradaSalida.pedirDatos();
        /*ArrayList<Coche> lista_coches=new ArrayList();
        lista_coches.add(m);
        EntradaSalida.mostrarCoche(lista_coches);*/
        GrabarFichero.grabarLinea(m);
    }
    
}
