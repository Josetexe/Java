/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.divisores;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int numero_elegido=EntradaSalida.pedirNumero();
        
        
        for (int n=1; n<=numero_elegido; n++)
        {
            if (numero_elegido%n==0)
            {
                EntradaSalida.mostrarDivisores (n, numero_elegido);
            }
        }
           
    }
}
