package ud5.funciones.ejemplos;

import java.util.Scanner;

public class Ejemplo3 {
	public static int maximoTres(int a, int b, int c) {

		int resultado = 0;

		if (a > b && a > c) {
			resultado = a;
		} else if (b > a && b > c) {
			resultado = b;
		} else {
			resultado = c;
		}

		return resultado;
	}
	
	public static void main(String[] args) {
		int a ,b ,c,resultado;
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce tres numeros");
		a=leer.nextInt();
		b=leer.nextInt();
		c=leer.nextInt();
		
		resultado=maximoTres(a,b,c);
		System.out.println("El mayor de los tres numeros es " + resultado);
	}
}
