/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentacorriente;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        int opcion;

        CuentaCorriente c=new CuentaCorriente("", 0);
        
        opcion=EntradaSalida.pedirMenu();
        
        while (opcion!=7)
        {
            switch (opcion)
            {
                case 1: 
                        String a=EntradaSalida.ingresarPersona();
                        int b=EntradaSalida.saldoInicial();
                        c.setTitular(a);
                        c.setSaldo(b);
                        break;

                
                case 2: 
                        c.gastar();
                        break;
                    
                    
                case 3: 
                        c.ingresar();
                        break;
                    
                
                case 4:
                        int ingresarX=EntradaSalida.ingresarx();
                        c.ingresarDinero(ingresarX);
                        break;
                    
                    
                case 5:
                        int gastarX=EntradaSalida.gastarx();
                        c.gastarDinero(gastarX);
                        break;
                        
                       
                case 6:
                    
                        System.out.println(c);
                        break;
                        
                        
            }
            
            opcion=EntradaSalida.pedirMenu();
            
        }
    }   
}
