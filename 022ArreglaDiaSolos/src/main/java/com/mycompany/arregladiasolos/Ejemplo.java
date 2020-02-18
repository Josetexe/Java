/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arregladiasolos;

/**
 *
 * @author CDMFP
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
      
	    //TIPOS DE DATOS
            int edad=EntradaSalida.preguntarEdad();
            String nombre=EntradaSalida.preguntarNombre();
            
            System.out.println("Hola "+nombre+" tienes "+edad+" años :P");
    }
    
}
