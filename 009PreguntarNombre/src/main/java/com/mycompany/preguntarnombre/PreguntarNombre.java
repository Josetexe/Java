/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntarnombre;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class PreguntarNombre {
    public static void main(String[] args) {
        String a=preguntarNombre();
        System.out.println("Has escrito: "+a);
    }
    public static String preguntarNombre ()
    {
        System.out.println("Por favor escriba su nombre");
        Scanner sc=new Scanner(System.in);
        String n=sc.nextLine();
        return n;
    }
}
