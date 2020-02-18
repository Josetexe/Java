/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.notamedia;

/**
 *
 * @author CDMFP
 */
public class NotaMedia {
    public static void main(String[] args) {
        int[] lista_notas=new int[4];
        int suma_total=0;
        
        //Método para rellenar notas:
        for (int i=0; i<lista_notas.length; i++)
        {
            lista_notas [i]=EntradaSalida.pedirNotaAlumno(i);
        }
        for (int z=0; z<lista_notas.length; z++)
        {
            suma_total=suma_total+lista_notas[z];
        }
        double media=(double)suma_total/(double)4;
        
            EntradaSalida.mostrarMedia (media);
    
    }
}
