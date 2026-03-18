package ud4.arrays2;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
//		Crea un programa que pida veinte números reales por teclado, los almacene en
//		un array y luego lo recorra para calcular y mostrar la media: (suma de valores) /
//		nº de valores
		double array1[]=new double[20];
		Scanner sc =new Scanner(System.in);
		double suma=0;
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Introduce un valor");
			array1[i]=sc.nextInt();
			suma+=array1[i];
		}
		sc.close();
		System.out.println("La media de los valores introducidos es de " + (suma/array1.length));
	}
}
