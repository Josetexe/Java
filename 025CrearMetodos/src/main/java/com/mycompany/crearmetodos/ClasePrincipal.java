/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crearmetodos;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        Coche mi_coche=new Coche(); 
        mi_coche.setCc(1500);
        mi_coche.setCv(144);
        mi_coche.setMarca("Ford");
        mi_coche.setModelo("Focus");
    
        System.out.println("Primer coche: "+mi_coche.getMarca()+" "+mi_coche.getModelo());
    }
    
    
    
}
