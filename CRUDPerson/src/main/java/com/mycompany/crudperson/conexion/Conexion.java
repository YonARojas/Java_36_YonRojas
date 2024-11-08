/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crudperson.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Yon Antony Rojas Nav
 */
public class Conexion {

    String hostname = "crudpersonas.c1mcycqcwikl.us-east-1.rds.amazonaws.com";
    String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/crud";
    String user = "admin";
    String password = "admin1234";

    Connection con;

    public Conexion() {
        try {

            con = DriverManager.getConnection(jdbcUrl, user, password);

        } catch (Exception e) {
            System.out.println("erro en la clase conexion: " + e);
        }
    }

    public Connection getConexion() {
        return con;
    }
}
