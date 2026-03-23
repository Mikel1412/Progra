package ud9.ejercicios.ficha1;

public class Ej05 {
//	Implementa un programa con tres funciones:
//		• void imprimePositivo(int p): Imprime el valor p. Lanza una ‘Exception’ si p < 0
//		• void imprimeNegativo(int n): Imprime el valor n. Lanza una ‘Exception’ si p >= 0
//		• La función main para realizar pruebas. Puedes llamar a ambas funciones
//		varias veces con distintos valores, hacer un bucle para pedir valores por
//		teclado y pasarlos a las funciones, etc. Maneja las posibles excepciones.
	static void imprimePositivo(int p) {
		if(p<0) {
			throw new IllegalArgumentException("Debe ser un numero positivo");
		}else {
			System.out.println("Numero "+ p + " correcto");
		}
		
	}

	static void imprimeNegativo(int n) {
		if(n>=0) {
			throw new IllegalArgumentException("Debe ser un numero negativo");
		}else {
			System.out.println("Numero "+ n + " correcto");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("NUMEROS");
		imprimeNegativo(1);
		imprimePositivo(-1);
	}

}
