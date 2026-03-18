package ud6_7.ficha1.ejercicio05;

public class Persona {
	public String dni, nombre, apellidos;
	public int edad;
	public Persona(String dni, String nombre, String apellidos, int edad) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		}
	public void imprime() {
		System.out.println("DNI: "+this.dni);
		System.out.println("NOMBRE: "+this.nombre);
		System.out.println("APELLIDOS: "+this.apellidos);
		System.out.println("EDAD: "+this.edad);
		if(esMayorEdad()==true) {
			System.out.println("Es mayor de edad");
		}else {
			System.out.println("Es menor de edad");
		}
	}

	/*// Devuelve true si es mayor de edad
	(false si no).*/
	public boolean esMayorEdad() {
		if(this.edad<=18) {
			return true;
		}else {
			return false;
		}
	}
	
}
