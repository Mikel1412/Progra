package ud4.arrays2;

import java.util.Scanner;

public class Ej8 {
	public static void main(String[] args) {
//		Crea un programa que cree un array con 100 números reales aleatorios entre
//		0.0 y 1.0, utilizando Math.random(), y luego le pida al usuario un valor real R. Por
//		último, mostrará cuántos valores del array son igual o superiores a R.
		double array1[]=new double[100];
		double n;
		int cont=0;
		Scanner sc =new Scanner(System.in);
		for (int i =0;i < array1.length;i++) {
			array1[i]=Math.random();
		}
		System.out.println("Introduce un valor entr 0.0 y 1.0");
		n=sc.nextDouble();
		for (int i =0;i < array1.length;i++) {
			if(n>=array1[i]) {
				cont++;
			}
		}
		sc.close();
		System.out.println(cont + "nº de valores igual o superiores a tu numero");
	}
}
