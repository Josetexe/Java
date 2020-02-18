/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datosbicicletasmadrid;

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
    public static ArrayList<Bicicletas> devolverDatos() 
    {
        ArrayList<Bicicletas> lista_bicicletas=new ArrayList();
        
        try {
            FileReader fr = new FileReader("C:\\TextosNetbeans\\accidentes_bici.csv");
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            linea=br.readLine();
            lista_bicicletas= new ArrayList();
            while(linea!=null)
            {
                linea=linea.replace(";;;", ";-;-;");
                linea=linea.replace(";;", ";-;");
                String[] dato=linea.split(";");
                // System.out.println("DATO: "+dato.length+"- \n"+linea);
                //fecha, hora, distrito, tipo_accidente, tipo_persona, rango_edad, sexo;
                if(dato.length>=13)
                {
                Bicicletas b=new Bicicletas(dato[1], dato[2], dato[5], dato[6], dato[9], dato[10], dato[11]);
                lista_bicicletas.add(b);
                }
                else
                {
                    System.out.println("Hay algo mal con la linea: "+linea);
                }
                linea=br.readLine();
            }
            
            
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LectorFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LectorFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        return lista_bicicletas;
    }
}
