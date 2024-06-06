/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libreria;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BDConexion {
     private Connection conexion;
    private Statement sentenciaSQL;
    private ResultSet resultado;
    
    public BDConexion() throws ClassNotFoundException, SQLException {
//        String controlador="com.mysql.jdbc.Driver"; (código original)
          String controlador ="com.mysql.cj.jdbc.Driver";
        Class.forName(controlador);
        
        String URL="jdbc:mysql://localhost:3306/librería?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String usuario="root";
        String contraseña="";
        conexion=DriverManager.getConnection(URL,usuario,contraseña);
    }
    
    public Connection Conectarse(){
        return conexion;
    }
    
    public void CerrarConexion() throws SQLException {
        if(resultado != null) resultado.close();
        if(sentenciaSQL != null) sentenciaSQL.close();
        if(conexion != null) conexion.close();
        
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
