package ud5.funciones.ejercicios.ficha1;

import java.util.Scanner;

public class Ejercicio9 {
//	Escribe un programa que pida un valor N entero y luego muestre: el sumatorio
//	des 1 a N, el productorio de 1 a N y el valor intermedio entre 1 y N. Implementa
//	y utiliza las funciones:
	
	public static int suma1aN(int n) {
		int resulSuma=0;
		for(int i=1;i<=n;i++) {
			resulSuma+=i;
		}
		return resulSuma;
	}
	
	public static long producto1aN(int n) {
		long resulProducto=1;
		for(int i=1;i<=n;i++) {
			resulProducto=resulProducto*i;
		}
		return resulProducto;
	}
	
	public static double intermedio1aN(int n) {
		double valorMedio=0;
		if (n%2!=0) {
			valorMedio=(n/2)+1;
		}else {
			valorMedio=(n/2)+.5;
		}
		return valorMedio;
	}
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numeroCalcular, resulSuma;
		long resulProducto;
		double resulIntermedio;
		System.out.println("Introduce un numero");
		numeroCalcular=leer.nextInt();
		
		resulSuma=suma1aN(numeroCalcular);
		resulProducto=producto1aN(numeroCalcular);
		resulIntermedio=intermedio1aN(numeroCalcular);
		
		System.out.println("El resultado de la suma es: " + resulSuma);
		System.out.println("El resultado del producto es: " + resulProducto);
		System.out.println("El numero intermedio es: " + resulIntermedio);
	}
}
