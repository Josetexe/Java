/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumadigitos;

import java.util.Scanner;
/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        int resultado = 0;
        numero = sc.nextInt();
        while(numero > 0) {

            resultado += numero % 10;

            numero = numero / 10;

        }

        System.out.println(resultado);

    }
}