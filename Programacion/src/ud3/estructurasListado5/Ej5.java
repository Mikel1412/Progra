package ud3.estructurasListado5;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
//		Realiza un programa que lea un número y a continuación escriba el carácter “*”
//		tantas veces igual al valor numérico leído. En aquellos casos en que el valor leído
//		no sea positivo se deberá escribir un único asterisco.
		
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce un numero");
		n=sc.nextInt();
		if(n>=0) {
			for (int i=1;i<=n;i++) {
				System.out.print("*");
			}
		}else{
			System.out.println("*");
		}
		sc.close();
	}
}
