/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jframeform;

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
    
    public static ArrayList<PreguntaRespuesta> devolverPreguntas()
    {
    ArrayList<PreguntaRespuesta> lista_preguntasrespuestas=new ArrayList();
    try {
            FileReader fr=new FileReader("C://TextosNetbeans//preguntarespuesta.csv");
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            lista_preguntasrespuestas=new ArrayList();
            while(linea!=null)
            {
                
                String[] datos=linea.split(";");
                PreguntaRespuesta c=new PreguntaRespuesta (datos[0], datos[1]);
                lista_preguntasrespuestas.add(c);
                linea=br.readLine();
            }
            //System.out.println(lista_contactos);    
        } 
    
    
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(JFrameForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        catch (IOException ex) 
        {
            Logger.getLogger(JFrameForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista_preguntasrespuestas;
    }
}