/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudpersona.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yon Antony Rojas Nav
 */
public class Conexion {

    String hostname = "database-1.c1mcycqcwikl.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/crudPersonas";
    String user = "admin";
    String password = "admin1234";

    Connection con;

    public Conexion() {
        try {

            con = DriverManager.getConnection(jdbcUrl, user, password);

        } catch (SQLException e) {
            System.out.println("error en la clase conexion: " + e);
        }
    }

    public Connection getConexion() {
        return con;
    }
}
