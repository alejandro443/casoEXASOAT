package pe.edu.upeu.soap.ws.entity;

public class Alumno {
private int idalumno;
private String nombres;
private String apellidos;
private String dni;
private String direccion;
private String telefono;
private String correo;

public Alumno() {

}

public Alumno(int idalumno, String nombres, String apellidos, String dni, String direccion, String telefono,
		String correo) {
	this.idalumno = idalumno;
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.dni = dni;
	this.direccion = direccion;
	this.telefono = telefono;
	this.correo = correo;
}

public int getIdalumno() {
	return idalumno;
}

public void setIdalumno(int idalumno) {
	this.idalumno = idalumno;
}

public String getNombres() {
	return nombres;
}

public void setNombres(String nombres) {
	this.nombres = nombres;
}

public String getApellidos() {
	return apellidos;
}

public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}

public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getTelefono() {
	return telefono;
}

public void setTelefono(String telefono) {
	this.telefono = telefono;
}

public String getCorreo() {
	return correo;
}

public void setCorreo(String correo) {
	this.correo = correo;
}

}
