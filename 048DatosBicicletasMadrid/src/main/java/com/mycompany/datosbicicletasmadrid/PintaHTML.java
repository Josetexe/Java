/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datosbicicletasmadrid;

import java.util.ArrayList;

/**
 *
 * @author CDMFP
 */
public class PintaHTML {
     public static String crearTabla(ArrayList<Bicicletas> datos_accidentes)
     {
         String color="";
         String color2="";
         String html="<html><head></head><body><table border=1><tr><th>Fecha</th><th>Hora</th><th>Distrito</th><th>Tipo de accidente</th><th>Tipo de persona</th><th>Rango de edad</th><th>Sexo</th></tr>";
         for (Bicicletas x : datos_accidentes)
         {
             if(x.getSexo().equals("Hombre"))
             {
                 color="green";
             }
             else
             {
                 color="blue";
             }
             
          
             if(x.getRango_edad().equalsIgnoreCase("DE 15 A 17 AÑOS"))
             {
                 color2="red";
             }
             else if(x.getRango_edad().equalsIgnoreCase("DE 30 A 34 AÑOS"))
             {
                 color2="yellow";
             }
             else if(x.getRango_edad().equalsIgnoreCase("DE 25 A 29 AÑOS"))
             {
                 color2="purple";
             }
             else
             {
                 color2="blue";
             }
             
             //html=html+...
             html+="<tr><td>"+x.getFecha()+"</td><td>"+x.getHora()+"</td><td>"+x.getDistrito()+"</td><td>"+x.getTipo_accidente()
                     +"</td><td>"+x.getTipo_persona()+"</td><td style='color:"+color2+";'>"+x.getRango_edad()+"</td>"
                     + "<td style='color:"+color+";'>"+x.getSexo()+"</td></tr>";
         }
     
         html=html+"</table></body></html>";
         return html;
     }
}
