/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.crud.personas.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Yon Antony Rojas Nav
 */
public class Conexion {
    
    String hostname = "mysql-1a16ac3e-vallegrande-ddaa.j.aivencloud.com";
    String jdbcUrl = "jdbc:mysql://"+hostname+":28396/crud";
    String user = "avnadmin";
    String password = "AVNS_3KkHaPebZud1oZWcJno";
    
    Connection con;
    
    public Conexion(){
        try{
            
            con = DriverManager.getConnection(  jdbcUrl,user,password);
            
        } catch (Exception e) {
            System.out.println("erro en la clase conexion: "+ e);
        }
    }
    
    public Connection getConexion(){
        return con;
    }
}
