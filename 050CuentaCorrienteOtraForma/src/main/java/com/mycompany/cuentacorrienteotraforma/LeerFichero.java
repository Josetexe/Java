/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentacorrienteotraforma;

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
public class LeerFichero {
    public static CuentaCorriente devolverDatos()
    {
        CuentaCorriente datos_cc=null;
        try {
            String ruta="C:\\TextosNetbeans\\CuentaCorriente.csv";
            FileReader fr=new FileReader(ruta);
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            while(linea!=null)
            {
                String[] datos=linea.split(",");
                int numero=Integer.parseInt(datos[1]);
                datos_cc=new CuentaCorriente (datos [0], numero);
                linea=br.readLine();
            }
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(LeerFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos_cc;
    } 
    
}
