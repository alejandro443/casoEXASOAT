package pe.edu.upeu.soap.ws.publico;

import javax.xml.ws.Endpoint;

import pe.edu.upeu.soap.ws.daoImpl.AlumnoDaoImpl;

public class AlumnoPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:3030/soap/alumno/id", new AlumnoDaoImpl());
		System.out.println("Ejecutando......!");
	}

}
