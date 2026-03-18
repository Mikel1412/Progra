package ud8.ejemplos;

public class Trabajador {
	private String nombre, puesto, direccion, telefono, nss;
	
	
	//Constructores
	public Trabajador(String nombre, String nss) {
		this.nombre = nombre;
		this.nss = nss;
	}
	
	
	//Metodos
	public boolean equals(Trabajador t) {
		return this.nss.equals(t.nss);
	}
	
	

	
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", direccion=" + direccion + ", telefono="
				+ telefono + ", nss=" + nss + "]";
	}


	//Getters y Setters
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPuesto() {
		return puesto;
	}


	public void setPuesto(String puesto) {
		this.puesto = puesto;
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


	public String getNss() {
		return nss;
	}


	public void setNss(String nss) {
		this.nss = nss;
	}
	
	
	
	
}
