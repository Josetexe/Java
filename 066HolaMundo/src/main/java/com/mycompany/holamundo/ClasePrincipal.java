/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.holamundo;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    while (num<0) {
        num=sc.nextInt();
    	}
    for (int i=1;i<=num;i++) {
        System.out.println("Hola mundo.");
    	}
    }
}
