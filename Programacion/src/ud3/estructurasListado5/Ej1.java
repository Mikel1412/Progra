package ud3.estructurasListado5;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
//		Realiza un programa que cuente los múltiplos de 3 desde el 1 hasta un número que
//		introducimos por teclado
		int cont=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce un numero");
		int n;
		n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			if (i%3==0) {
				cont+=1;
			}
		}
		System.out.println("Numeros multiplos de 3= " + cont);
		sc.close();
	}
}
