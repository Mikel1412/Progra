package ud3.estructurasEjercicios;

import java.io.IOException;
import java.util.Scanner;

public class Ej3 {
	public static void main(String[] args) throws IOException {
		/*Crea un programa que pida dos números ‘nota’ y ‘edad’ y un carácter ‘género’.
		Si la nota es mayor o igual a 5 y la edad es mayor o igual a 18 mostrará
		"ACEPTADA" si el género es "F" o "ACEPTADO" si el género es "M", si no se
		cumplen estas condiciones, se mostrará "NO ACEPTADO/A
		*/
		int edad;
		int nota;
		char genero;
		Scanner leer =new Scanner(System.in);
		System.out.println("¿Que edad tienes?");
		edad=leer.nextInt();
		System.out.println("¿Que nota has sacado?");
		nota=leer.nextInt();
		leer.nextLine();
		if(nota>=5&&edad>=18) {
			System.out.println("¿Cual es tu genero? (F o M)");
			genero=(char)System.in.read();
			if(genero=='M') {
				System.out.println("Aceptado");
			}else if (genero=='F') {
				System.out.println("Aceptada");
			}
		}else {
			System.out.println("No aceptado/a");
		leer.close();
		}
	}
}