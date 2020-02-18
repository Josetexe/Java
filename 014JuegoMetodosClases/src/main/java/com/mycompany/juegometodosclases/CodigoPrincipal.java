/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.juegometodosclases;

/**
 *
 * @author CDMFP
 */
public class CodigoPrincipal {
    public static void main(String[] args) {
        
        int numero_correcto=ClaseCalculo.obtenerAleatorio();
        int numero_usr=EntradaSalida.pedirNumero();
        while(numero_usr!=numero_correcto)
        {
            ClaseCalculo.compararNumeros(numero_correcto, numero_usr);
            numero_usr=EntradaSalida.pedirNumero();
        }
        System.out.println("ENHORABUENA ");
    } 
}
