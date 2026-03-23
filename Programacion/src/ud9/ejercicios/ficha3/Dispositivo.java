package ud9.ejercicios.ficha3;

import java.io.IOException;

public abstract class Dispositivo {
	private String nombre, versionFirmware;
	private int precio;
	private Fabricante fabricante;
	
	
//CONTRUCTORES
	
	public Dispositivo(String nombre, String versionFirmware, int precio, Fabricante fabricante) {
		this.nombre=nombre;
		this.versionFirmware=versionFirmware;
		this.precio=precio;
		this.fabricante=fabricante;
	}

//METODOS
	
	public abstract void activarWallet() throws IOException;
	
	public void actualizarFirmware() {

	}
	
//GETTERS Y SETTERS
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getVersionFirmware() {
		return versionFirmware;
	}


	public void setVersionFirmware(String versionFirmware) {
		this.versionFirmware = versionFirmware;
	}


	public int getPrecio() {
		return precio;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
	}


	public Fabricante getFabricante() {
		return fabricante;
	}


	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	
	
}
