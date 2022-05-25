/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.parial2.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author SERGESAN PCS2021
 */
public class Conexion {
    private static final String URL="jdbc:postgresql://ec2-3-231-82-226.compute-1.amazonaws.com:5432/d2hpoukotv73bf";
    private static final String DRIVER ="org.postgresql.Driver";
    private static final String PASS="854af1a228aec093541ab4a1f988ddf91421c678fdd71706171497ca8ecf4f9d";
    private static final String USER="kqfhfjaeeqivzh";
    private static Connection cx = null;
        
    public static Connection getConex(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
                 
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:"+e);
        }
    return cx;
    }
}
