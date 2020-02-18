/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        try {
            String ruta="C:\\TextosNetbeans\\agenda.txt";
            FileReader fr=new FileReader(ruta);
            BufferedReader br=new BufferedReader(fr);
            String linea=br.readLine();
            while(linea!=null)
            {
                System.out.println("LINEA: "+linea);
                linea=br.readLine();
            }
        } 
        
        catch (IOException ex) {
            Logger.getLogger(ClasePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
