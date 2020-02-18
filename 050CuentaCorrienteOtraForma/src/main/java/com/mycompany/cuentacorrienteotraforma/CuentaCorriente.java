/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuentacorrienteotraforma;

/**
 *
 * @author CDMFP
 */
public class CuentaCorriente {
    private String nombre;
    private int saldo;

    public CuentaCorriente(String nombre, int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }
    public void ingresar()
    {
        saldo=saldo+10;
    }
    public void gastar()
    {
        saldo=saldo-10;
    }
    public void ingresar(int x)
    {
        saldo=saldo+x;
    }
    public void gastar(int x)
    {
        saldo=saldo-x;
    }

    @Override
    public String toString() {
        return "Cuentas Corrientes en uso: \n NOMBRE: "+nombre+" SALDO: "+saldo;
    }
}
