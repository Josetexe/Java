/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntasabcd;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        /*int opcion=EntradaSalida.pedirMenu();
        String nombre="";*/
        ArrayList<Preguntas> lista_preguntas=BDPreguntas.obtenerPreguntas();
        for (Preguntas p: lista_preguntas)
        {
            int opcion_seleccionada=EntradaSalida.hacerPregunta(p);
            if (opcion_seleccionada==p.getCorrecta())
            {
                System.out.println("ENHORABUENA");
            }
        }
    }
}
        
        
        
        
        
        /*
        while(opcion!=3)
        {
            switch (opcion)
            {
                case 1: 
                    nombre=EntradaSalida.pedirNombre();
                    ArrayList<Preguntas> lista_respuestas=BDPreguntas.obtenerPreguntas();
                    for(Preguntas p: lista_preguntas)
                    {
                        String respuesta_usuario=EntradaSalida.hacerPregunta(p);
                        if (respuesta_usuario.equalsIgnoreCase(p.getRespuestas()))
                            
                    }
                    
                    
            }
        }
        
    }
    
    
    /**public static void main(String[] args) {
        String nombre="";
        int puntuacion=0;
        ArrayList<Ranking> lista_ranking=new ArrayList();
        int opcion=EntradaSalida.pedirMenu();//1-Jugar 2-Ver ranking 3-Salir
        
       while(opcion!=3)
       {
           switch(opcion)
           {
               case 1: //Este es el caso para Jugar
                   nombre=EntradaSalida.pedirNombre();
                   //obtenerPreguntas devuelve un ArrayList de 4 objetos Pregunta(pregunta, respuesta)
                    ArrayList<Pregunta> lista_preguntas=BDPreguntas.obtenerPreguntas();
                    for(Pregunta p: lista_preguntas)
                            {
                                        //Aquí saca la pregunta al usuario y lee su respuesta
                                    String respuesta_usuario=EntradaSalida.hacerPregunta(p);
                                    if (respuesta_usuario.equalsIgnoreCase(p.getRespuesta()))
                                    {
                                        puntuacion++;
                                    }
                            }
                    Ranking r=new Ranking(nombre, puntuacion);
                    lista_ranking.add(r);
                    break;
                case 2: //Este es el caso para Sacar el ranking
                EntradaSalida.mostrarRanking(lista_ranking);
                    
                break;
            
        
        
           }
       opcion=EntradaSalida.pedirMenu();//1-Jugar 2-Ver ranking 3-Salir
       }*/

