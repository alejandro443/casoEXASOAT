package pe.edu.upeu.soap.ws.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.jws.WebService;

import pe.edu.upeu.soap.ws.dao.AlumnoDao;
import pe.edu.upeu.soap.ws.entity.Alumno;
import pe.edu.upeu.soap.ws.util.Conexion;
@WebService(endpointInterface = "pe.edu.upeu.soap.ws.dao.AlumnoDao")
public class AlumnoDaoImpl implements AlumnoDao {
private PreparedStatement ps;
private ResultSet rs;
private Connection cx;
	@Override
	public Alumno readAlumno(int id) {
		// TODO Auto-generated method stub
		Alumno alum = new Alumno();
		try {
			cx = Conexion.getConexion();
			ps =cx.prepareStatement("select *from alumno where idalumno=?");
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()) {				
				alum.setIdalumno(rs.getInt("idalumno"));
				alum.setNombres(rs.getString("nombres"));
				alum.setApellidos(rs.getString("apellidos"));
				alum.setDni(rs.getString("dni"));
				alum.setDireccion(rs.getString("direccion"));
				alum.setTelefono(rs.getString("telefono"));
				alum.setCorreo(rs.getString("correo"));
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return alum;
	}

}
