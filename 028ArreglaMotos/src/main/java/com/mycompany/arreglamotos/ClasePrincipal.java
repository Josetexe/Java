/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arreglamotos;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
        public static void main(String[] args) {
        int n=EntradaSalida.pedirNumeroMotos();//Pregunta cuÃ¡ntas motos desea introducir.
        ArrayList<Moto> lista_motos=new ArrayList();
            for (int i=0; i<n; i++)
            {
                Moto m=EntradaSalida.pedirDatosMoto();//La moto tiene marca, modelo y matrÃ­cula
                lista_motos.add(m);
            }
       
       EntradaSalida.mostrarMotos(lista_motos);//En este mÃ©todo se recorre el ArrayList mostrando cada objeto Moto.
    }
   
}

