package ud4.arrays2;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
//		Crea un programa que pida veinte números enteros por teclado, los almacene
//		en un array y luego muestre por separado la suma de todos los valores positivos
//		y negativos.
		Scanner sc = new Scanner(System.in);
		int array1[] = new int[20];
		int negativos=0, positivos=0;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce un valor (negativos o positivos)");
			array1[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i< array1.length;i++) {
			if(array1[i]<0) {
				negativos+=array1[i];
			}
			if(array1[i]>0) {
				positivos+=array1[i];
			}
		}
		System.out.println("La suma de numeros negativos es de " + negativos + " y la suma de numeros positivos es de " + positivos);
	}
}
