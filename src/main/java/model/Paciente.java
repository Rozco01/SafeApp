package model;

public class Paciente {
	
	//Datos Basicos
	String nombre;
	String apellidos;
	String edad;
	String direccion;
	String ciudad;
	String telefono;
	
	//Datos de contacto
	String nombreContacto;
	String direccionContacto;
	String telefonoContacto;
	String parentesco;
	
	//Datos Clinicos
	String nombreMedico;
	String diagnostico;
	String fechaConsulta;
	String imprecionPersonal;
	
	//Getter and Setter
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getEdad() {
		return edad;
	}
	public void setEdad(String edad) {
		this.edad = edad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getNombreContacto() {
		return nombreContacto;
	}
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	public String getDireccionContacto() {
		return direccionContacto;
	}
	public void setDireccionContacto(String direccionContacto) {
		this.direccionContacto = direccionContacto;
	}
	public String getTelefonoContacto() {
		return telefonoContacto;
	}
	public void setTelefonoContacto(String telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}
	public String getParentesco() {
		return parentesco;
	}
	public void setParentesco(String parentesco) {
		this.parentesco = parentesco;
	}
	public String getNombreMedico() {
		return nombreMedico;
	}
	public void setNombreMedico(String nombreMedico) {
		this.nombreMedico = nombreMedico;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public String getFechaConsulta() {
		return fechaConsulta;
	}
	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}
	public String getImprecionPersonal() {
		return imprecionPersonal;
	}
	public void setImprecionPersonal(String imprecionPersonal) {
		this.imprecionPersonal = imprecionPersonal;
	}
}
