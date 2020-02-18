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
public class BDPreguntas {
    
    
    
    
    public static ArrayList<Preguntas> obtenerPreguntas()
    {
        ArrayList<Preguntas> lista_preguntas=new ArrayList<>();
        
        ArrayList<String> respuestas1=new ArrayList<>();
        respuestas1.add("Pamplona");
        respuestas1.add("NY");
        respuestas1.add("Madrid");
        respuestas1.add("Barcelona");
        
        ArrayList<String> respuestas2=new ArrayList<>();
        respuestas2.add("Cordoba");
        respuestas2.add("Jaen");
        respuestas2.add("Madrid");
        respuestas2.add("Sevilla");
        
        ArrayList<String> respuestas3=new ArrayList<>();
        respuestas3.add("1959");
        respuestas3.add("1960");
        respuestas3.add("1935");
        respuestas3.add("1980");
        
        
        
        Preguntas p1=new Preguntas ("¿Donde fue el 11-S?", respuestas1, 1);
        Preguntas p2=new Preguntas ("¿Donde fue el 11-M?", respuestas2, 2);
        Preguntas p3=new Preguntas ("¿Cuándo nació ETA?", respuestas3, 0);
        
        lista_preguntas.add(p1);
        lista_preguntas.add(p2);
        lista_preguntas.add(p3);
        
        return lista_preguntas;
    }
}
