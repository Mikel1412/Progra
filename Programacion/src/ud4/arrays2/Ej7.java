package ud4.arrays2;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
//		Crea un programa que pida dos valores enteros P y Q, luego cree un array que
//		contenga todos los valores desde P hasta Q, y lo muestre por pantalla
		int P, Q;
		Scanner sc = new Scanner(System.in);
		System.out.println("Intoduce el primer valor");
		P = sc.nextInt();
		System.out.println("Introduce el segundo valor");
		Q = sc.nextInt();
		int array1[]=new int[(Q-P)+1];
		for(int i = 0;i < array1.length;i++) {
			array1[i]=P;
			P++;
			System.out.println(array1[i]);
		}
		sc.close();
	}
}
