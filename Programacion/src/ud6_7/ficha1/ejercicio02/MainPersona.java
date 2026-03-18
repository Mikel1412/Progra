package ud6_7.ficha1.ejercicio02;

import java.util.Scanner;

public class MainPersona {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Persona pers1 = new Persona();
		Persona pers2 = new Persona();
		
		System.out.println("Introduce el nombre de la primera persona");
		pers1.nombre = leer.nextLine();
		
		System.out.println("Introduce el nombre de la segunda persona");
		pers2.nombre = leer.nextLine();
		
		System.out.println("Introduce los apellidos de la primera persona");
		pers1.apellidos = leer.nextLine();
		
		System.out.println("Introduce los apellidos de la segunda persona");
		pers2.apellidos = leer.nextLine();
		
		System.out.println("Introduce el dni de la primera persona");
		pers1.dni = leer.nextLine();
		
		System.out.println("Introduce el dni de la segunda persona");
		pers2.dni = leer.nextLine();
		
		System.out.println("Introduce la edad de la primera persona");
		pers1.edad = leer.nextInt();
		
		System.out.println("Introduce la edad de la segunda persona");
		pers2.edad = leer.nextInt();
	
		
		System.out.println(pers1.nombre + " " + pers1.apellidos + " con DNI " + pers1.dni + mayorONo(pers1.edad) + " es mayor de edad");
		System.out.println(pers2.nombre + " " + pers2.apellidos + " con DNI " + pers2.dni + mayorONo(pers2.edad) + " es mayor de edad");
	}
	
	public static String mayorONo(int edad){
		String mayorONo = " no";
		if(edad>=18) {
			mayorONo = "";
		}
		return mayorONo;
	}
}
