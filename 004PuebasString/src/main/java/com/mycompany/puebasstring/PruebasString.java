/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.puebasstring;

/** .charAt -> devuelve el caracter en la posicion especificada. 
 *  .equals -> compara dos variables y dice si son iguales (true or false). 
 *  .equalsIgnoreCase   -> idem anterior sin tener en cuenta MAY o min. 
 *  .indexOf -> devuelve la posicion de un caracter especificado.
 *  .length() -> devuelve el numero de caracteres totales.
 *  .replace (char antiguo, char nuevo)
 *  .substring -> devuelve caracter sacado del principal
 *  .toLowerCase ->
 *  .toUpperCase ->
 * 
 * 
 * @author CDMFP
 */
public class PruebasString {
    public static void main(String[] args) {
        String numero_cuenta="ES2859876284795384576245";
        String numero_cuenta2="es6873168689437500163480";
        
        char posicion=numero_cuenta.charAt(1);
        boolean comparar=numero_cuenta.equals(numero_cuenta2);
        boolean compararsinmayus=numero_cuenta.equalsIgnoreCase(numero_cuenta2);
        int posiciondecaracter=numero_cuenta.indexOf('5');
        int longitud=numero_cuenta.length();
        String remplazo=numero_cuenta.replace('7', '9');
        String empezaren3=numero_cuenta.substring(3);
        String todoaminusculas=numero_cuenta.toLowerCase();
        String todoamayusculas=numero_cuenta2.toUpperCase();
        
        System.out.println("El numero que se encuentra en la posicion 3 es: "+posicion);
        System.out.println("¿Los numeros de cuenta "+numero_cuenta+" y "+numero_cuenta2+" son iguales?: "+comparar);
        System.out.println("¿Los numero de cuenta "+numero_cuenta+" y "+numero_cuenta2+" son iguales? (sin tener en cuenta may o min): "+compararsinmayus);
        System.out.println("En la posicion 1 se encuentra en el caracter: "+posiciondecaracter);
        System.out.println("La longitud del nº de cuenta es: "+longitud+" digitos ");
        System.out.println("Reemplazamos el numero 7 por el 9: "+remplazo);
        System.out.println("En numero de cuenta sin ESXX seria: "+empezaren3);
        System.out.println("El IBAN con todo en minúsculas sería: "+todoaminusculas);
        System.out.println("El IBAN con todo en mayúsculas sería: "+todoamayusculas);
        
        
        
        
    }
    
}
