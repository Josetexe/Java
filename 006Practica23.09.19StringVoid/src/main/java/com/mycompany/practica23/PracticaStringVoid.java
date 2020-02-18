/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.practica23;

/**
 *
 * @author CDMFP
 */
public class PracticaStringVoid {
    
    public static void main(String[] args) {
        String Nombre="Juan";
        int edad=27;
        
        int anyo_actual=2019;
        int anyo_nacimiento=1993;
        int edadFinal=(anyo_actual-anyo_nacimiento);
            
        System.out.println("La edad es:"+edadFinal);
    }
    
    public static void saludarPersona(String nombre, int edad) 
    {
        System.out.println("Hola te llamas "+nombre+" y tienes "+edad+" años");
    }
    
    public static String edadFinal(String nombre, int anyo_actual, int anyo_nacimiento, int edadFinal) 
    {
        
        return "Hola te llamas "+nombre+" y tienes "+edadFinal+" años";
     
    }
}
