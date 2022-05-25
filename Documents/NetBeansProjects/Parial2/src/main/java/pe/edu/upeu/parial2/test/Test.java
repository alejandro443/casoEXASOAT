/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.upeu.parial2.test;

//import com.google.gson.Gson;

import com.google.gson.Gson;
import pe.edu.upeu.parial2.config.Conexion;
import pe.edu.upeu.parial2.dao.PostDao;
import pe.edu.upeu.parial2.dao.UsuarioDao;
import pe.edu.upeu.parial2.daoImpl.PostDaoImpl;
import pe.edu.upeu.parial2.daoImpl.UsuarioDaoImpl;
import pe.edu.upeu.parial2.model.Usuario;


//import pe.edu.upeu.casoexa.dao.PostDao;
//import pe.edu.upeu.casoexa.daoImpl.PostDaoImpl;

/**
 *
 * @author SERGESAN PCS2021
 */
public class Test {
    static Gson gson = new Gson();
    static PostDao p = new PostDaoImpl();
    static UsuarioDao udao=new UsuarioDaoImpl();
    

    public static void main(String[] args) {

        if (Conexion.getConex() != null) {
            System.out.println("Conectado");
        } else {
            System.out.println("No conectado");
        }
       System.err.println(gson.toJson(p.readAll()));
       System.err.println(gson.toJson(udao.readAll()));
    }
}
