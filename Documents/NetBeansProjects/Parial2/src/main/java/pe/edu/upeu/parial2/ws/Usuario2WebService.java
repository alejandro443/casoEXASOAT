/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package pe.edu.upeu.parial2.ws;

import java.util.List;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import pe.edu.upeu.parial2.dao.UsuarioDao;
import pe.edu.upeu.parial2.daoImpl.UsuarioDaoImpl;
import pe.edu.upeu.parial2.model.Usuario;

/**
 *
 * @author SERGESAN PCS2021
 */
@WebService(serviceName = "Usuario2WebService")
public class Usuario2WebService {
//private PostDao dao =new PostDaoImpl();
private UsuarioDao usu=new UsuarioDaoImpl();
        
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
        
    }
    @WebMethod(operationName = "readAllPost")
    public List<Usuario> readAllPost() {
        return usu.readAll();
    }
    
    
    
    
}
