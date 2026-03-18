package ud3.estructurasEjercicios;

import java.util.Scanner;

public class Ej5 {
	public static void main(String[] args) {
		/*Escribe un programa que lea un año e indique si es bisiesto, teniendo en cuenta
			que un año es bisiesto si:
			• es un número divisible por 4 pero no es divisible por 100
			• si es divisible por 400.
		 */
		int año;
		Scanner sc =new Scanner(System.in);
		System.out.println("Dime un año");
		año=sc.nextInt();
		if(año%4==0&&año%100!=0||año%400==0) {
			System.out.println("Es un año bisiesto");
		}else {
			System.out.println("No es un año bisiesto");
		}
		sc.close();
	}
}
