/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.primos;

/**
 *
 * @author CDMFP
 */
public class ClavePrincipal {
    public static void main(String[] args) {
        int numero=EntradaSalida.pedirNumero();
        boolean esprimo=true;
        
        for (int n=2; n<numero; n++)
        {
            if (numero%n==0)
            {
                esprimo=false;
            }
               
        }
            System.out.println("Es primo: "+esprimo);
        
    
    
    
        
    }
}
