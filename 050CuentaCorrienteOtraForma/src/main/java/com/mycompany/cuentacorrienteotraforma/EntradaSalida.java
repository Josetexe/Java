/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentacorrienteotraforma;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class EntradaSalida {
    static int mostrarMenu(CuentaCorriente c) {
        if (c==null)
        {
            System.out.println("1-Crear cuenta corriente.\n" );
        }
        else
        {
        System.out.println("1-Crear cuenta corriente.\n" +
        "\n" +
        "2-Gastar.\n" +
        "\n" +
        "3-Ingresar.\n" +
        "\n" +
        "4-Gastar una cantidad.\n" +
        "\n" +
        "5-Ingresar una cantidad.\n" +
        "\n" +
        "6-Ver  saldo.\n" +
        "\n" +
        "7-Grabar. \n"+
        "\n" +
        "8-Salir.");
        }
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        return n;
    }

    static CuentaCorriente pedirDatosCuenta() {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Introduzca el nombre");
        String nombre=sc.nextLine();
        System.out.println("Introduzca el saldo");
        int saldo=sc.nextInt();
        CuentaCorriente c=new CuentaCorriente(nombre, saldo);
        return c;
    }

    static int pedirCantidad() {
        System.out.println("Introduzca la cantidad");
        Scanner sc=new Scanner(System.in);
        int cantidad=sc.nextInt();
        
        return cantidad;
    }
}
