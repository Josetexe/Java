/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.guardarenfichero;

import java.io.FileWriter;
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
            FileWriter fw=new FileWriter("C:\\TextosNetbeans\\agenda.txt", true);
            fw.write("Hola, buenos dias");
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(ClasePrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
