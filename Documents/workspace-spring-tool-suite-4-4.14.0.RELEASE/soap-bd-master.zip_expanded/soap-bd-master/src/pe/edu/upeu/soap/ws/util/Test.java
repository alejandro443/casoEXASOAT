package pe.edu.upeu.soap.ws.util;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(Conexion.getConexion()!=null) {
			System.out.println("conectado");
		}else {
			System.out.println("Error");
		}
	}

}
