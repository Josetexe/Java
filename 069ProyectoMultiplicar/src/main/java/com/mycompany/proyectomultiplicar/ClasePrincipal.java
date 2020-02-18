/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomultiplicar;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion=EntradaSalida.pedirOpcion();
        AccesoDatos.inicializarBD();
        while(opcion!=EntradaSalida.SALIR)
        {
            switch(opcion)
            {
                case EntradaSalida.JUGAR:
                    int n=EntradaSalida.preguntarNTabla();
                    int numero_op=EntradaSalida.preguntarNumero();
                    int contador=0;
                    for(int i=0; i<numero_op; i++){
                        int n_aleatorio=(int)(Math.random()*10);
                        int resultado=EntradaSalida.preguntarOperacion(n, n_aleatorio);
                        int resultado_correcto=n*n_aleatorio;
                        if(resultado==resultado_correcto){
                            contador++;
                        }else{
                            
                        }
                    }
                    String nombre=EntradaSalida.preguntarNombre();
                    double puntuacion=(contador*10)/(double)numero_op;
                    Persona p=new Persona(nombre, puntuacion);
                    AccesoDatos.insertarJugador(p);
                    break;
                case EntradaSalida.VER_RANKING:
                    ArrayList<Persona> lista_persona=AccesoDatos.recuperarJugadores();
                    EntradaSalida.mostrarJugadores(lista_persona);
                    break;
            }
            opcion=EntradaSalida.pedirOpcion();
        }
    }
}
