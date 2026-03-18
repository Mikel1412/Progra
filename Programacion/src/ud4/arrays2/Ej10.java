package ud4.arrays2;

import java.util.Scanner;

public class Ej10 {
	public static void main(String[] args) {
//		Crea un programa para realizar cálculos relacionados con la altura (en metros)
//		de personas. Pedirá un valor N y luego almacenará en un array N alturas
//		introducidas por teclado. Luego mostrará la altura media, máxima y mínima así
//		como cuántas personas miden por encima y por debajo de la media

		Scanner sc = new Scanner(System.in);
		double alturaMedia, alturaMaxima, alturaMinima, encimaMedia = 0, debajoMedia = 0, sumaAlturas = 0;
		int numeroAlturas;
		System.out.println("Cuantas alturas quieres introducir?");
		numeroAlturas = sc.nextInt();
		double alturas[] = new double[numeroAlturas];

		// pedimos alturas
		for (int i = 0; i < alturas.length; i++) {
			System.out.println("Intorduce una altura");
			alturas[i] = sc.nextDouble();
		}
		sc.close();

		// calculo de altura media
		for (int i = 0; i < alturas.length; i++) {
			sumaAlturas+=alturas[i];
		}
		alturaMedia=sumaAlturas/numeroAlturas;
		
		//calculo altura maxima y minima
		alturaMaxima=alturas[0];
		alturaMinima=alturas[0];
		
		for (int i = 0; i < alturas.length; i++) {
			if (alturaMaxima < alturas[i]) {
				alturaMaxima=alturas[i];
			}
			if (alturaMinima < alturas[i]) {
				alturaMinima=alturas[i];
			}
		}
		
		//calculo altura encima/debajo media
		for (int i = 0; i < alturas.length; i++) {
			if (alturas[i]<alturaMedia) {
				debajoMedia++;
			}
			if (alturas[i]>alturaMedia) {
				encimaMedia++;
			}
		}
		System.out.println("La altura media es " + alturaMedia);
		System.out.println("La altura maxima es " + alturaMaxima + " y la altura minima " + alturaMinima);
		System.out.println("La altura por encima de la media es de " + encimaMedia + " y por debajo " + debajoMedia);
	}
}
