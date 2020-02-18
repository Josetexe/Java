/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyectomultiplicar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CDMFP
 */
class AccesoDatos {
    private static Connection conexion=null;
    private static Statement stmt=null;
    static void inicializarBD() {
     try {
        conexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/ranking_juego",
                "root", "");
        stmt= conexion.createStatement();
    } catch (SQLException ex) {
        Logger.getLogger(AccesoDatos.class.getName()).log(Level.SEVERE, null, ex);
    }    
    }
    static void insertarJugador(Persona p) {
        try {
             
            String nombre=p.getNombre();
            double puntuacion=p.getPuntuacion();
            String sql="INSERT INTO t_jugadores VALUES ('"+nombre+"', '"+puntuacion+"')";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(AccesoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    static ArrayList<Persona> recuperarJugadores(){
        ArrayList<Persona> lista=new ArrayList<>();
        try {
            
            String query="SELECT * FROM t_jugadores ORDER BY puntuacion DESC";
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next())
            {
                String nombre=rs.getString("nombre");
                double puntuacion=rs.getDouble("puntuacion");
                Persona p=new Persona(nombre, puntuacion);
                lista.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AccesoDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lista;
    }
}