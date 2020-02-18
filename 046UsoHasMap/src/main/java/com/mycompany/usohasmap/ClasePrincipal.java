/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.usohasmap;

import java.util.HashMap;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        HashMap<Integer, String> m=new HashMap();
        m.put(4, "Plaza de España");
        m.put(8, "Plaza de Colón");
        
        String nombre_estacion=(String)m.get(4); 
        
        for(Integer c : m.keySet())
        {
            System.out.println("Clave: "+c+" Valor: "+m.get(c));
        }
     
        
    }
}
