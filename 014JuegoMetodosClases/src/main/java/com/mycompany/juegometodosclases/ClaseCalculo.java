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
public class ClaseCalculo {
    
    static int obtenerAleatorio() {
        int a=(int)(Math.random()*10);
        return a;
    }

    static void compararNumeros(int n, int numero_usr) {
        if (n>numero_usr)
        {
            System.out.println("El número pensado es mayor");
        }
        else if (n<numero_usr)
        {
             System.out.println("El número pensado es menor");
        }
    }
 }
