/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.validadordni;



/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    
    public static void main(String[] args) 
	{
        String dni=EntradaSalida.pedirDNI();
        boolean dni_correcto=validarDNI(dni);
        System.out.println("El DNI es correcto: "+dni_correcto);
    }

    private static boolean validarDNI(String dni) 
	{
       char[] letras={'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
       if (dni.length()!=9)
       {
           return false;
       }
      String numero= dni.substring(0, 8);
      String letra=dni.substring(8, 9);
      int num=0;
      try
      {
          num=Integer.parseInt(numero);
      }
      catch(Exception e)
      {
          return false;
      }
      int resto=num%23;
      char letra_correcta=letras[resto];
      char letra_dni=letra.charAt(0);
      if (letra_correcta!=letra_dni)
      {
          return false;
      }
     return true; 
    }
}
    

