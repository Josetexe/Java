/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cochegrabararraylist;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        int numero_coches=2;
        ArrayList<Coche> lista_coches=new ArrayList();
        for(int i=0; i<numero_coches; i++)
        {
            Coche c=EntradaSalida.pedirDatos();
            lista_coches.add(c);
        }
        
        
        GrabarFichero.grabarLinea(lista_coches);
    }
    
}

