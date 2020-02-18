/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datosbicicletasmadrid;

/**
 *
 * @author CDMFP
 */
public class Bicicletas {
    private String fecha, hora, distrito, tipo_accidente, tipo_persona, rango_edad, sexo;

    public Bicicletas(String fecha, String hora, String distrito, String tipo_accidente, String tipo_persona, String rango_edad, String sexo) {
        this.fecha = fecha;
        this.hora = hora;
        this.distrito = distrito;
        this.tipo_accidente = tipo_accidente;
        this.tipo_persona = tipo_persona;
        this.rango_edad = rango_edad;
        this.sexo = sexo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTipo_accidente() {
        return tipo_accidente;
    }

    public void setTipo_accidente(String tipo_accidente) {
        this.tipo_accidente = tipo_accidente;
    }

    public String getTipo_persona() {
        return tipo_persona;
    }

    public void setTipo_persona(String tipo_persona) {
        this.tipo_persona = tipo_persona;
    }

    public String getRango_edad() {
        return rango_edad;
    }

    public void setRango_edad(String rango_edad) {
        this.rango_edad = rango_edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Datos accidente: "+"Fecha="+fecha+", Hora="+hora+", Distrito="+distrito+", Tipo de accidente="+tipo_accidente+", Tipo de persona="+tipo_persona+", Rango de edad="+rango_edad+", Sexo="+sexo+"\n";
    }
    
    
}
