/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntasabcdfilereader;

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
public class Externo {
    
    public static ArrayList<Contacto> devolverPreguntas()
    {
    ArrayList<Contacto> lista_contactos=new ArrayList();
    try {
            FileReader fr=new FileReader("C://TextosNetbeans//textos.csv");
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            lista_contactos=new ArrayList();
            while(linea!=null)
            {
                
                String[] datos=linea.split(",");
                Contacto c=new Contacto(datos[0], datos[1], datos[2], datos[3], datos[4], 1);
                lista_contactos.add(c);
                linea=br.readLine();
            }
            //System.out.println(lista_contactos);    
        } 
    
    
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(ClasePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        catch (IOException ex) 
        {
            Logger.getLogger(ClasePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista_contactos;
    }
}
        
    
        

