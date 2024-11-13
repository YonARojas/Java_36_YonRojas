/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.crudpersona.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Yon Antony Rojas Nav
 */
public class TestConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hostname = "database-1.c1mcycqcwikl.us-east-1.rds.amazonaws.com";
        String jdbcUrl = "jdbc:mysql://" + hostname + ":3306/crudPersonas";
        String user = "admin";
        String password = "admin1234";

        Connection con = null;

        try {
            con = DriverManager.getConnection(jdbcUrl, user, password);
            if (con != null) {
                System.out.println("conexion exitosa");
            }
        } catch (SQLException e) {
            System.out.println("error:" + e);
        }
    }

}
