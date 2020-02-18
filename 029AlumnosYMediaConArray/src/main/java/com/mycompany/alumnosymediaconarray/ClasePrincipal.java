/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alumnosymediaconarray;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) 
    {
        int n=EntradaSalida.pedirNumeroAlumnos();
        float suma_total=0;
        ArrayList<Alumnos> Lista_alumnos=new ArrayList();
            for (int i=0; i<n; i++)
            {
                Alumnos a=EntradaSalida.pedirDatosAlumnos();
                Lista_alumnos.add(a);
            }
            
        EntradaSalida.mostrarAlumnos (Lista_alumnos);
    
        for (Alumnos a : Lista_alumnos)
            suma_total=suma_total+a.getNota();
        
        
        /*for (int z=0; z<n; z++)
            {
                Alumnos a=Lista_alumnos.get(z);
                suma_total=suma_total+a.getNota();
            }*/
        
        float media=(float)suma_total/(float)n;

            EntradaSalida.mostrarMedia(media);    
    }  
}
