package ud9.ejercicios.ficha1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej04 {
	public static void main(String[] args) {
//		Implementa un programa que cree un vector de enteros de tamaño N (número
//		aleatorio entre 1 y 100) con valores aleatorios entre 1 y 10. Luego se le
//		preguntará al usuario qué posición del vector quiere mostrar por pantalla,
//		repitiéndose una y otra vez hasta que se introduzca un valor negativo. Maneja
//		todas las posibles excepciones.
		Scanner leer = new Scanner(System.in);
 		
		int posicion;
		int aleatorio = (int) (Math.random() * 100 + 1);
		int array1[] = new int[aleatorio];

		for (int i = 0; i < array1.length; i++) {
			array1[i]=(int)(Math.random()*10+1);
		}
		
		try {
			do {
				System.out.println("Que posicion del array quieres mostrar?");
				posicion=leer.nextInt();
				System.out.println(array1[posicion]);
			}while(posicion>0);
		}catch(InputMismatchException e) {
			System.err.println("Valor introducido no valido");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("Esa posicion no existe");
		}
	}
}
