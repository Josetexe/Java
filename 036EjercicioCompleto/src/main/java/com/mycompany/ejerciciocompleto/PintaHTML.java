/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejerciciocompleto;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class PintaHTML {
    public static String crearTabla(ArrayList<Agenda> lista_contactos)
    {
        String html="<html><head></head><body><table border=1 bordercolor=blue><tr><th>Nombre</th><th>Apellidos</th><th>E-mail</th></tr>";
        for (Agenda x : lista_contactos)
        {
            html=html+"<tr><td>"+x.getNombre()+"</td><td>"+x.getApellidos()+"</td><td>"+x.getEmail()+"</td></tr>";
        }
        html=html+"</table></body></html>";
        return html;
    }
}
