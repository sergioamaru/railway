/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicioweb;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author administradorPC
 */
public class Conexion {

    private Connection conectar;
    private String BD;
    private String usuario;
    private String contra;
    private static Conexion con;


    private Conexion() {
        this.conectar = null;
        this.BD = "bd_bareno";
        this.usuario = "root";
        this.contra = "12345678";
    }

    public void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.BD = "jdbc:mysql://localhost:3306/bd_bareno?";
            this.usuario = "root";
            this.contra = "12345678";
            this.conectar = (Connection) DriverManager.getConnection(BD, usuario, contra);
            System.out.println("conecxion exitosa ");
        } catch (ClassNotFoundException | HeadlessException | SQLException e) {

            System.out.println("Error al conectar: " + e);
        }
    }

    public Connection getConexion() {
        return conectar;
    }
    public static Conexion getIntance(){
        if(con==null){
            con=new Conexion();
        }
        return con;
    }

}
