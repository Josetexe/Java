/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sumaenpantalla;

/**
 *
 * @author CDMFP
 */
public class Operacion {
    private int operando1, operando2, resultado;
    
    public Operacion()
    {
        operando1=(int)(Math.random()*10);
        operando2=(int)(Math.random()*10);
        resultado=operando1+operando2;
    }

    public int getOperando1() {
        return operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
}
