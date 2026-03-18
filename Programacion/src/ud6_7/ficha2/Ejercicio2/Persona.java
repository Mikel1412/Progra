package ud6_7.ficha2.Ejercicio2;

public class Persona {
	private String nombre = "", DNI, sexo = "H";
	private int edad = 0, peso = 0, altura = 0;

	public Persona() {

	}

	public Persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.DNI = "";
		this.peso = 0;
		this.altura = 0;
	}

	public Persona(String nombre, int edad, String sexo, String DNI, int peso, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.DNI = DNI;
		this.peso = peso;
		this.altura = altura;
	}

	public static final int pesoBajo = -1;
	public static final int pesoIdeal = 0;
	public static final int pesoAlto = 1;
	private static final String sex = "H";

	public int calcularIMC() {
		int resultado;
		if (peso / (altura * altura) < 20) {
			resultado = pesoBajo;
		} else if (peso / (altura * altura) > 25) {
			resultado = pesoAlto;
		} else {
			resultado = pesoIdeal;
		}
		return resultado;
	}

	public boolean esMayorDeEdad() {
		boolean resultado = true;
		if (edad < 18) {
			resultado = false;
		}
		return resultado;
	}

	public String comprobarSexo(String sexo) {
		String sexoBien;
		if(sexo!="H"||sexo!="h"||sexo!="m"||sexo!="M") {
			sexoBien=sex;
		}else {
			sexoBien=sexo;
		}
		return sexoBien;
	}
	
	public String generaDNI() {
		String DNI;
		int numero = (int) (Math.random()*99999999)+10000000;
		char[] letra = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		int posicionLetra=numero%23;
		DNI = "" + numero + letra[posicionLetra];
		return DNI;
	}
	
	public String toString() {
		return "Persona\n " + "nombre=" 
				+ nombre + "\n edad=" + edad 
				+ "\n dni=" + DNI + "\n sexo=" 
				+ sexo + "\n peso=" + peso + "\n altura=" + altura;
		}

	//Settera
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setSexo(String sexo) {
		this.sexo=comprobarSexo(sexo);
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
	}
	
	public void setPeso(int peso) {
		this.peso=peso;
	}
	
	public void setAltura(int altura) {
		this.altura=altura;
	}
}
