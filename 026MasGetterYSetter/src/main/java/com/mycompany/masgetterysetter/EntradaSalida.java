/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.masgetterysetter;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    public static Coche preguntarCoche()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Indique el nombre de la marca de su coche");
        String marca=sc.nextLine();
        System.out.println("Ahora el modelo de su coche");
        String modelo=sc.nextLine();
        System.out.println("Dígame el color de su coche");
        String color=sc.nextLine();
        System.out.println("Introduzca la matricula de su coche");
        String matricula=sc.nextLine();
        System.out.println("Por ultimo, introduza la potencia de su coche");
        int potencia=sc.nextInt();
        
        Coche c=new Coche(marca, modelo, color, matricula, potencia);
        
        return c;
    }
    
    public static void mostrarDatos(Coche c)
    {
        System.out.println("Los datos introducidos para este vehículo son: "+c.getMarca()+" "+c.getModelo()+" ,"+c.getColor()+" ,"+c.getMatricula()+" ,"+c.getPotencia());
    }
    
   
}
