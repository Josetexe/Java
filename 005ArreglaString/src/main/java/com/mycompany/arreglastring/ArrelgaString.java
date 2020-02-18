 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglastring;

/**
 *
 * @author CDMFP
 */
public class ArrelgaString {
   
    
    public static void main(String[] args) {
        saludar("Manuel");
        saludar("Ana");
        int x=duplicarNumero (8);
        System.out.println("El doble de 8 es "+x);
        int y=sumarNumeros (2, 3);
        System.out.println("Sumar "+2+" y "+3+" es igual a "+y);
    }
    
    public static void saludar (String nombre)
    {
        System.out.println("Buenos días "+nombre);
        
    }
    
    public static int duplicarNumero(int numero)
    {
        return 2*numero;
    }
    
    public static int sumarNumeros (int suma1, int suma2)
    {
        return suma1+suma2;
    }
}
