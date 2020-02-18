/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contaminacion;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
public class LectorFichero {
    
    private static ArrayList<String> obtenerDatos(String[] datos) 
    {
        
        ArrayList<String> c=new ArrayList<>();
        for(int i=8; i<54; i=i+2)
        {
            c.add(datos[i]);
        }
        return c;
    }
    
    public static ArrayList<Contaminacion> devolverDatos()
    {
        ArrayList<Contaminacion> lista_contaminacion=new ArrayList();
        try {
            FileReader fr=new FileReader("C:\\TextosNetbeans\\horario_tiemporeal.csv");
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            linea=br.readLine();
            lista_contaminacion=new ArrayList();
            while(linea!=null)
            {
                String[] datos=linea.split(";");
                ArrayList<String> datos_contaminacion=obtenerDatos(datos);
                
                Contaminacion c=new Contaminacion (datos [7]+"-"+datos [6]+"-"+datos[5], datos [3], datos [2], datos_contaminacion);
                lista_contaminacion.add(c);
                linea=br.readLine();
            }
            /*System.out.println(lista_contaminacion);*/
            //InputMismatchException
            
            } 
        
            catch (FileNotFoundException ex) {
            Logger.getLogger(ClasePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }   
            
            catch (IOException ex) {
            Logger.getLogger(ClasePrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        
            return lista_contaminacion;
    }

    
     
}