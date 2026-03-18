package practica4;

//Mikel Gómez

public class Cliente {
	private String dni, nombre, apellidos;
	private int telefono;
	
	
	public Cliente(String dni, String nombre, String apellidos, int telefono) {
		this.nombre=nombre;
		this.dni=dni;
		this.apellidos=apellidos;
		this.telefono=telefono;
	}
	
	
	//GETTERS Y SETTERS
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
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
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	
}
