/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.masgetterysetter;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        
        Coche c=EntradaSalida.preguntarCoche();
        EntradaSalida.mostrarDatos(c);
        
        
    }
}
