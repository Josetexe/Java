/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectoclas;

import java.util.ArrayList;

/**
 *
 * @author Alex
 */
class PintaHML {
    public static String crearTabla(ArrayList<Teleoperadores> lista)
    {
        String html="<html><head></head><body><table bordercolor=blue border=1><tr><th>Nombre</th><th>Apellido</th><th>Edad</th><th>Antiguëdad</th></tr>";
        for (Teleoperadores x: lista)
        {
            html=html+"<tr><td>"+x.getNombre()+"</td><td>"+x.getApellido()+"</td><td>"+x.getEdad()+"</td><td>"+x.getAntiguedad()+"</td></tr>";
        }
        html=html+"</table></body></html>";
        return html;
    }
}
