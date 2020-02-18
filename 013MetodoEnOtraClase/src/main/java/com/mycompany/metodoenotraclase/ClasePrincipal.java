/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Cuando hay un "=" es porque se espera respuesta -> devuelve algo que se va a meter en "a"
//EntradaSalida -> nombre de la clase (la otra pestaña) y pedirNumero -> es el nombre del metodo (lo que va a hacer el programa)
//Static -> Cuando se llama desde el nombre de la clase, con el "=". 
//No static -> Cuando se llama con es.mostrarsuma / Porque "es" es un objeto
//Void -> cuando no devuelve nada, no hay un "="

//static -> pertenece a la clase math.random()
//no static -> cuando se le llama desde un objeto 


package com.mycompany.metodoenotraclase;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int a=EntradaSalida.pedirNumero();
        int b=EntradaSalida.pedirNumero();
        EntradaSalida es=new EntradaSalida();
        es.mostrarSuma(a, b);//Este metodo hace un sout de tipo "La suma de ... y ... es ..."
    }
}
