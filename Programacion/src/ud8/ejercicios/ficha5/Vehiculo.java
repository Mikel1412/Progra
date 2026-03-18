package ud8.ejercicios.ficha5;

public class Vehiculo {
	private int año, autonomia;
	private String matricula, marca;

	// CONTRUCTORES
	public Vehiculo() {

	}

	public Vehiculo(String matricula, String marca, int año, int autonomia) {
		this.matricula = matricula;
		this.marca = marca;
		comprobarAnio(año);
		this.autonomia = autonomia;
	}

	// GETTERS SETTERS

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// METODOS

	public void comprobarAnio(int año) {
		if (this.año < 1800 && this.año > 2030) {
			this.año=2000;
		}
	}

	// ToString
	@Override
	public String toString() {
		return "Vehiculo [año=" + año + ", autonomia=" + autonomia + ", matricula=" + matricula
				+ ", marca=" + marca + "]";
	}
}
