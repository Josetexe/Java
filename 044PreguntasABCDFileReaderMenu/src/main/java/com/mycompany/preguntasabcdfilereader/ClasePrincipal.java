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
        
        ArrayList<Ranking> lista_ranking=new ArrayList();
        ArrayList<Contacto> lista_preguntas=Externo.devolverPreguntas();
        
        int opcion=EntradaSalida.pedirMenu();
        
        while (opcion!=3)
        {
            switch (opcion)
            {
                case 1: 
                        nombre=EntradaSalida.pedirNombre();
                        for (Contacto c: lista_preguntas)
                        {
                            int opcion_seleccionada=EntradaSalida.hacerPreguntas(c);
                            if (opcion_seleccionada==c.getIndiceCorrecto())
                            {
                                puntuacion++;
                            }
                            
                        }
                    
                        Ranking r=new Ranking(nombre, puntuacion);
                        lista_ranking.add(r);
                        break;
                
                case 2: 
                    
                    EntradaSalida.mostrarRanking(lista_ranking);
                    break;
            }
            opcion=EntradaSalida.pedirMenu();
        }
        
            
        
    }
}

