/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglardiassemana;

/**
 *
 * @author CDMFP
 */
public class DiasSemana {
    public static void main(String[] args) {
        String[] dias={"Lunes", "Martes", "miércoles",
            "Jueves", "Viernes", "Sábado", "Domingo"};
        
        int n_dia=EntradaSalida.preguntarNumeroDia(); //El usuario introducirá un número entre 1 y 7
        
        System.out.println("El numero de día "+n_dia+" corresponde al día: "+dias);
        }
}

