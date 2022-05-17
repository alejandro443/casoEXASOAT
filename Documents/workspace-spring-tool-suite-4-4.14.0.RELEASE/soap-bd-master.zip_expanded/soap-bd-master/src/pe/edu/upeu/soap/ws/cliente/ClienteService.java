package pe.edu.upeu.soap.ws.cliente;


import pe.edu.upeu.soap.ws.daoImpl.AlumnoDao;
import pe.edu.upeu.soap.ws.daoImpl.AlumnoDaoImplService;

public class ClienteService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlumnoDaoImplService pds = new AlumnoDaoImplService();
		AlumnoDao pd = pds.getAlumnoDaoImplPort();
		System.out.println("Alumno");
		System.out.println(pd.readAlumno(2).getCorreo());
	}

}
