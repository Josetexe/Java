/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.preguntasabcd;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class Preguntas {
    private String pregunta;
    private ArrayList<String> respuestas;
    private int correcta;

    public Preguntas(String pregunta, ArrayList<String> respuestas, int correcta) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
        this.correcta = correcta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public ArrayList<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<String> respuestas) {
        this.respuestas = respuestas;
    }

    public int getCorrecta() {
        return correcta;
    }

    public void setCorrecta(int correcta) {
        this.correcta = correcta;
    }

    @Override
    public String toString() {
        return "Preguntas{" + "pregunta=" + pregunta + ", respuestas=" + respuestas + ", correcta=" + correcta + '}';
    }
    
    
    
}
