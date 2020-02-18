/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tablas;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class PintaHTML {
    public static String crearTabla(ArrayList<Moto> lista)
    {
        String html="<html><head></head><body><table>";
        for (Moto x: lista)
        {
            html=html+"<tr><td>"+x.getMarca()+"</td><td>"+x.getModelo()+"</td><td>"+x.getMatricula()+"</td></tr>";
        }
        html=html+"</table></body></html>";
        return html;
    }
}
