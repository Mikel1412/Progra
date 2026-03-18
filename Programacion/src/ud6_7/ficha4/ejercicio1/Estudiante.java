package ud6_7.ficha4.ejercicio1;

public class Estudiante {
	private String nombre, curso;
	private int edad = 1, idEstudiante;
	public static int codEstudiante=0;
	public final int edadDefecto = 10;

	public Estudiante(String nombre, String curso) {
		this.nombre = nombre;
		this.curso = curso;
		this.edad=edadDefecto;
		this.idEstudiante = codEstudiante;
		codEstudiante++;
	}

	public Estudiante(String nombre, int edad, String curso) {
		this.nombre = nombre;
		this.curso = curso;
		this.edad = comprobarEdad(edad);
		this.idEstudiante = codEstudiante;
		codEstudiante++;
	}

	public int comprobarEdad(int edad) {
		int edadComprobada;
		if (edad <= 0) {
			edadComprobada = edadDefecto;
		} else {
			edadComprobada = edad;
		}
		return edadComprobada;
	}	
	
	public String mostrarInformacion() {
		return "Estudiante [nombre=" + nombre + ", curso=" + curso + ", edad=" + edad + ", idEstudiante=" + idEstudiante
				+ "]";
	}

	public void cumplirAnios() {
		this.edad=this.edad+1;
	}

	//GETTERS Y SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
