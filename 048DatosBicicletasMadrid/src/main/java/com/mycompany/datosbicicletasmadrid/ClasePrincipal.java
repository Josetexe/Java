/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datosbicicletasmadrid;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class ClasePrincipal {
    public static void main(String[] args) {
        ArrayList<Bicicletas> datos_accidentes=LectorFichero.devolverDatos();
        
        System.out.println(datos_accidentes);
        
        String html_tabla=PintaHTML.crearTabla (datos_accidentes);
        GrabarFichero.grabarLinea(html_tabla, "C:\\TextosNetbeans\\fichero_bicis.html");
    }
}
