package ud10.ficha5;

public class Alumno implements Comparable<Alumno>{
	private String nombre;
	private int edad, nota;

	public Alumno(String nombre, int nota, int edad) {
		this.nombre = nombre;
		this.edad = edad;
		this.nota = nota;
	}

	public int compareTo(Alumno a) {
		int resultado = a.getNota() - this.nota;
		if (resultado == 0) {
			return this.nombre.compareTo(a.getNombre());
		} else {
			return resultado;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

}
