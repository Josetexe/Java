/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntasabcdfilereader;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        int puntuacion=0;
        String nombre="";
        nombre=EntradaSalida.pedirNombre();
        ArrayList<Ranking> lista_ranking=new ArrayList();
        ArrayList<Contacto> lista_preguntas=Externo.devolverPreguntas();
        
        
        for (Contacto c: lista_preguntas)
        {
            int opcion_seleccionada=EntradaSalida.hacerPreguntas(c);
            if (opcion_seleccionada==c.getIndiceCorrecto())
            {
                puntuacion++;
            }
            /*nombre=EntradaSalida.pedirNombre();
            opcion_seleccionada=EntradaSalida.hacerPreguntas(c);*/
            
        }
        
        Ranking r=new Ranking(nombre, puntuacion);
        lista_ranking.add(r);
        System.out.println(r);
        
        
    }
}

