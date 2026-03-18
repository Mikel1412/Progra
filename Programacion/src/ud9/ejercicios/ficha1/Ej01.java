package ud9.ejercicios.ficha1;

import java.util.Scanner;

public class Ej01 {
//	Implementa un programa que pida al usuario un valor entero A utilizando un
//	nextInt() (de Scanner) y luego muestre por pantalla el mensaje “Valor
//	introducido: …”. Se deberá tratar la excepción InputMismatchException que
//	lanza nextInt() cuando no se introduce un entero válido. En tal caso se mostrará
//	el mensaje “Valor introducido incorrecto”
	public static void main(String[] args) {
		int A;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un numero");
		A=leer.nextInt();
		System.out.println("El valor introducido: " + A);
	}
}
