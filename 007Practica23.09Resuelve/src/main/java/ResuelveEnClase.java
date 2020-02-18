/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CDMFP
 */
public class ResuelveEnClase {
    
    public static void main(String[] args) {
        int a=20;
        int b=15;
        int c=realizarSuma(a, b);
        String suma=devolverTextoConSuma(a, b);
        System.out.println("La suma de "+a+" y "+b+" es "+c);
        System.out.println("USANDO METODO devolverTextoConSuma:"+suma);
    }
    
    public static int realizarSuma(int a, int b) 
    {
        int suma=a+b;
        return suma; 
    }
    
    public static String devolverTextoConSuma(int a, int b)
    {
        String texto="La suma es "+(a+b);
        return texto;
    }
}
