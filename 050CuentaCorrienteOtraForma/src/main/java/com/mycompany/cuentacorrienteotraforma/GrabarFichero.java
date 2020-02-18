/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentacorrienteotraforma;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
public class GrabarFichero {
    public static void grabarLinea(CuentaCorriente a)
    {
        String linea=a.getNombre()+","+a.getSaldo()+"\n";
               
        try {
            FileWriter fw = new FileWriter("C:\\TextosNetbeans\\CuentaCorriente.csv", false);
            fw.write(linea);
            fw.close();
            
        } catch (IOException ex) {
            Logger.getLogger(GrabarFichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
