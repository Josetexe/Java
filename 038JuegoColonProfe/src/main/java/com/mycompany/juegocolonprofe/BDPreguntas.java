/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegocolonprofe;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
class BDPreguntas {
    public static ArrayList<Pregunta> obtenerPreguntas()
    {
        ArrayList<Pregunta> lista=new ArrayList<>();
        Pregunta p1=new Pregunta("Nombre del padre de Colón", "Domingo");
        Pregunta p2=new Pregunta("Año descubirmiento America", "1492");
        Pregunta p3=new Pregunta("nombre del padre de Colón", "Domingo");
        Pregunta p4=new Pregunta("nombre del padre de Colón", "Domingo");
        lista.add(p4);
        lista.add(p3);
        lista.add(p2);
        lista.add(p1);
        return lista;
    }

}
    
