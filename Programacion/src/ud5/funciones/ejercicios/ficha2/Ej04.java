package ud5.funciones.ejercicios.ficha2;

import java.util.Scanner;

public class Ej04 {
//	Implementa un método contarPalabras que reciba una cadena y devuelva
//	cuántas palabras tiene (las palabras están separadas por espacios).
	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		String cadena, nPalabras;
		System.out.println("Introduce una cadena para contar sus palabras");
		cadena=leer.nextLine();
		
		System.out.println("La cadena tiene " + contarPalabras(cadena) + " palabras");
	}
	
	public static int contarPalabras (String cadena) {
		int nPalabras, espacios=0;
		char espacio=' ';
		cadena=cadena.trim();
		
		for(int i = 0; i<cadena.length();i++) {
			if(cadena.charAt(i)==' ') {
				espacios++;
			}
		}
		nPalabras=espacios+1;
		return nPalabras;
	}
}
