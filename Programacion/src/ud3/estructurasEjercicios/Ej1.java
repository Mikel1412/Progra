package ud3.estructurasEjercicios;

import java.util.Scanner;

public class Ej1 {
	public static void main(String[] args) {
		//Crea un programa que capture un número por teclado e indique si es par o impar.
		int numero;
		Scanner leer =new Scanner(System.in);
		System.out.println("Introduce un numero");
		numero=leer.nextInt();
		leer.close();
		if (numero%2==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		
		
	}
}
