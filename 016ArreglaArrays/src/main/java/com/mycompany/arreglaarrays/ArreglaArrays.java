/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglaarrays;

/**
 *
 * @author CDMFP
 */
public class ArreglaArrays {
    public static void main(String[] args) {
        String[] lista_nombres=new String[4];
        for (int i=0; i<lista_nombres.length; i++)
        {
            lista_nombres[i]=EntradaSalida.pedirNombreAlumno();
        }
        //Ahora se va a recorrer los nombres:
        for (int j=0; j<lista_nombres.length; j++)
        {
            EntradaSalida.mostrarNombre(lista_nombres[j]);
        }
        }

}
