/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.contaminacion;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class Contaminacion {
    private String fecha;
    private String magnitud;
    private String estacion;
    private ArrayList<String> datos;

    public Contaminacion(String fecha, String magnitud, String estacion, ArrayList<String> datos) {
        this.fecha = fecha;
        this.magnitud = magnitud;
        this.estacion = estacion;
        this.datos = datos;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }

    public String getEstacion() {
        return estacion;
    }

    public void setEstacion(String estacion) {
        this.estacion = estacion;
    }

    public ArrayList<String> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<String> datos) {
        this.datos = datos;
    }

    @Override
    public String toString() {
        
        /*return texto="En la fecha "+fecha+"en la magnitud "+magnitud+"y en la estacion "+estacion+"los datos son: "+datos+;*/
        
        
        return "Fecha="+fecha+", magnitud="+magnitud+", estacion="+estacion+"\n"+"   Datos de la contaminacion="+datos+"\n";
        
        /*return "Datos de la contaminacion:"+"fecha="+fecha+", magnitud="+magnitud+", estacion="+estacion+", datos="+datos+"\n";*/
    }
    
    
    
    
    
}
