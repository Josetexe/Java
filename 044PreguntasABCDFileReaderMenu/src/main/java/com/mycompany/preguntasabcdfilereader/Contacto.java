/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntasabcdfilereader;

/**
 *
 * @author CDMFP
 */
public class Contacto {
    private String pregunta, respuesta1, respuesta2, respuesta3, respuesta4;
    private int indiceCorrecto;

    public Contacto(String pregunta, String respuesta1, String respuesta2, String respuesta3, String respuesta4, int indiceCorrecto) {
        this.pregunta = pregunta;
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
        this.respuesta3 = respuesta3;
        this.respuesta4 = respuesta4;
        this.indiceCorrecto = indiceCorrecto;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(String respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public String getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(String respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getRespuesta3() {
        return respuesta3;
    }

    public void setRespuesta3(String respuesta3) {
        this.respuesta3 = respuesta3;
    }

    public String getRespuesta4() {
        return respuesta4;
    }

    public void setRespuesta4(String respuesta4) {
        this.respuesta4 = respuesta4;
    }

    public int getIndiceCorrecto() {
        return indiceCorrecto;
    }

    public void setIndiceCorrecto(int indiceCorrecto) {
        this.indiceCorrecto = indiceCorrecto;
    }

    @Override
    public String toString() 
    {
        String texto="\n"+pregunta+"\n"+respuesta1+"\n"+respuesta2+"\n"+respuesta3+"\n"+respuesta4+"\n";
        return texto;
    }
       
    
}
