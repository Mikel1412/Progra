package ud3.estructurasListado5;

import java.util.Scanner;

public class Ej2 {
	public static void main(String[] args) {
//		Realiza un programa en java que pida un número entero positivo y nos diga si es
//		primo o no
		int n;
		int v=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduce un numero");
		n=sc.nextInt();
		for (int i=1; i<=n; i++) {
			if (n%i==0) {
				v+=1;
//				v=v+1;
			}
		}
		if(v==2) {
			System.out.println("El numero es primo");
		}else {
			System.out.println("El numero no es primo");
		}
		sc.close();
	}
}
