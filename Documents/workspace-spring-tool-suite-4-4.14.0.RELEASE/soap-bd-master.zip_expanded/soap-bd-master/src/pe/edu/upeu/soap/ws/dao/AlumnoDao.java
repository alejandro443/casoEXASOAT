package pe.edu.upeu.soap.ws.dao;

import javax.jws.WebMethod;
import javax.jws.WebService;

import pe.edu.upeu.soap.ws.entity.Alumno;

@WebService
public interface AlumnoDao {
@WebMethod
public Alumno readAlumno(int id) ;


}
