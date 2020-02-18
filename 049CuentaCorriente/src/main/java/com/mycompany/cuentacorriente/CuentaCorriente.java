/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentacorriente;

import java.util.Scanner;

/**
 *
 * @author CDMFP
 */
public class CuentaCorriente {
    private String titular;
    private int saldo;

    public CuentaCorriente(String titular, int saldo_inicial) {
        this.titular = titular;
        this.saldo = saldo_inicial;
    }
    
    public void ingresar()
    {
        saldo=saldo+10;
    }
    
    public void gastar()
    {
        saldo=saldo-10;
    }
    
    public void ingresarDinero(int gastarX)
    {
        saldo=saldo+gastarX;
    }
    
    public void gastarDinero (int gastarX)
    {
        saldo=saldo-gastarX;
    }
    
    
    

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "titular=" + titular + ", saldo_inicial=" + saldo + '}';
    }
    
    
}
