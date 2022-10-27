/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioweb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pc
 */
public class PersonaDAO {

    private static final String SQL_READALL = "SELECT * FROM persona ";
    private static final Conexion con= Conexion.getIntance();
 
    public PersonaDAO() {
     con.conectar();
    }

    public List<PersonaDTO> readAll() {
        
        
        List<PersonaDTO> lista = null;
        PreparedStatement ps;
        try {
            ps = con.getConexion().prepareStatement(SQL_READALL);
            ResultSet rs = ps.executeQuery();
            lista = new ArrayList<>();
            while (rs.next()) {
                PersonaDTO obj = new PersonaDTO(
                        rs.getString("nombre"),
                        rs.getString("telefono"),
                        rs.getString("correo"),
                        rs.getString("clave"));
                lista.add(obj);
            }
        } catch (SQLException ex) {
            System.out.println("Error al conectar: " + ex);
        }
        return lista;
    }
    public boolean insertar(PersonaDTO persona){
        PreparedStatement ps;
        try{
           ps=con.getConexion().prepareStatement("INSERT INTO persona(nombre, telefono, correo, clave) VALUES (?,?,?,?)");
           ps.setString(1, persona.getNombres());
            System.out.println("1");
           ps.setString(2, persona.getTelefono());
           System.out.println("1");
           ps.setString(3, persona.getCorreo());
           System.out.println("1");
           ps.setString(4, persona.getClave());
           System.out.println("1");
           ps.execute();
           return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
            
        }
    }
}
