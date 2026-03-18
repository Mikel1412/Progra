package practica4;

//Mikel Gómez

import java.util.Objects;

public class Vehiculos {
	private String matricula;
	private boolean disponible=true;
	private Cliente cliente;
	private final int PRECIO_BASE = 50;
	private static int totalVehiculos=0;

	//CONDTRUCTORES
	public Vehiculos() {
		totalVehiculos++;
	}
	
	public Vehiculos(String matricula, boolean disponible) {
		this.matricula=matricula;
		this.disponible=disponible;
		totalVehiculos++;
	}
	
	// METODOS
	public void calcularCosteAlquiler() {}


	public void alquilar(Cliente cliente) {
		
		if(this.disponible) {
			this.disponible = false;
			this.setCliente(cliente);
			
			System.out.println("El vehiculo se ha alquilado con exito");
		}else {
			System.out.println("No ha sido posble alquilar el vehiculo");
		}
	}
	
	public static void numeroTotalVehiculos(){
		System.out.println("El numero total de vehiculos creados es " + totalVehiculos);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculos other = (Vehiculos) obj;
		return Objects.equals(matricula, other.matricula);
	}

	@Override
	public String toString() {
		String disponibleONo;
		if(disponible) {
			disponibleONo="DISPONIBLE";
		}else {
			disponibleONo="NO DISPONIBLE";
		}
		return "matricula=" + matricula + "\n" + disponibleONo;
	}

	
	
	//GETTERS Y SETTERS
	
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public int getPRECIO_BASE() {
		return PRECIO_BASE;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
}
