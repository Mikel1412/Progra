package ud3.estructurasEjercicios;

import java.util.Scanner;

public class Ej4 {
	public static void main(String[] args) {
		/*
		 * Crea un programa que lea 3 datos de entrada A, B y C. Estos datos corresponden
			a las dimensiones de los lados de un triángulo.
			El programa debe determinar qué tipo de triangulo es, teniendo en cuenta los
			siguiente:
			• Si se cumple Pitágoras entonces es triángulo rectángulo.
			• Si sólo dos lados del triángulo son iguales entonces es isósceles.
			• Si los 3 lados son iguales entonces es equilátero.
			• Si no se cumple ninguna de las condiciones anteriores, es escaleno.
		 */
		int a, b, c;
		Scanner leer =new Scanner(System.in);
		System.out.println("Escribeme tres valores de un triangulo(el ultimo el mas grande)");
		a=leer.nextInt();
		b=leer.nextInt();
		c=leer.nextInt();
		leer.close();
		if((a^2+b^2)==(c^2)) {
			System.out.println("El triangulo es resctangulo");
		}else {
			if(a==b&&a==c) {
				System.out.println("El triangulo es equilatero");
			}else {
				if(a==b||b==c||c==a) {
					System.out.println("El triangulo es isosceles");
				}else {
					System.out.println("El triangulo es escaleno");
				}
			}	
		}
	}
}
