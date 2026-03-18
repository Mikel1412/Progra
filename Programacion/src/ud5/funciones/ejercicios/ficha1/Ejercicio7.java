package ud5.funciones.ejercicios.ficha1;

import java.util.Scanner;

public class Ejercicio7 {
	// escribe in programa que pide cino precios y muestre por pantalla el precio de
	// venta de cada ino tras aplicarle in 21% de IVA.
	// Implententa y utiliza la funcion
	// double precioConIVA(double precio) // Devuelve el precio tras suarle un 21%
	// de IVA

	public static double precioConIVA(double precio) {
		double precioIVA = 0.21;
		double resultado;
		resultado = precioIVA * precio;
		return resultado;
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		
		double precio;
		double resultado=0.0;
		
		for(int i = 0; i<5;i++) {
			System.out.println("Introduce el precio del producto");
			precio=leer.nextDouble();
			resultado=precioConIVA(precio);
			System.out.println("Precio: " + precio);
			System.out.println("IVA(21%): " + resultado);
			System.out.println("Precio con IVA: " + (precio+resultado));
		}
	}
}
