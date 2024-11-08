/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.crud.personas.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Yon Antony Rojas Nav
 */
public class mysql {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hostname = "mysql-1a16ac3e-vallegrande-ddaa.j.aivencloud.com";
        String jdbcUrl = "jdbc:mysql://" + hostname + ":28396/crud";
        String user = "avnadmin";
        String password = "AVNS_3KkHaPebZud1oZWcJno";
        
        Connection con = null;
        
        try {
            con = DriverManager.getConnection(  jdbcUrl,user,password);
            if(con != null){
                System.out.println("conexion exitosa");
            }
        } catch (Exception e) {
            System.out.println("error:"+ e);
        }
    }

}
