package ud9.ejercicios.ficha1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej02 {
//	Implementa un programa que pida dos valores int A y B utilizando un nextInt()
//	(de Scanner), calcule A/B y muestre el resultado por pantalla. Se deberán tratar
//	de forma independiente las dos posibles excepciones,
//	InputMismatchException y ArithmeticException, mostrando en cada caso un
//	mensaje de error diferente en cada caso.
	public static void main(String[] args) {
		int A,B;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce dos numeros enteros");
		try {
		A=leer.nextInt();
		B=leer.nextInt();
		
		int resultado=A/B;
		System.out.println(resultado);
		}catch (InputMismatchException e){
			System.out.println("El caracter introducido no es correcto");
		}catch (ArithmeticException e){
			System.out.println("Los numeros no son divisibles entre ellos");
		}
	}
}
