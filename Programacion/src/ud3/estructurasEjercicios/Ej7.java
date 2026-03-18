package ud3.estructurasEjercicios;

import java.util.Scanner;

public class Ej7 {
	public static void main(String[] args) {
//		Crea un programa en Java que muestre en pantalla un menú con las siguientes
//		opciones:
//		--- MENÚ PRINCIPAL ---
//		1. Iniciar sesión
//		2. Registrarse
//		3. Recuperar contraseña
//		4. Salir
//		El programa debe:
//		• Pedir al usuario que introduzca un número correspondiente a una opción del
//		menú.
//		• Usa un switch para mostrar un mensaje en función de la opción elegida:
//		i. Si elige 1, mostrar: "Has elegido Iniciar sesión".
//		ii. Si elige 2, mostrar: "Has elegido Registrarse".
//		iii. Si elige 3, mostrar: "Has elegido Recuperar contraseña".
//		iv. Si elige 4, mostrar: "Saliendo del programa...".
//		v. Si introduce un número que no está entre 1 y 4, mostrar: "Opción no
//		válida".
		int n;
		System.out.println("--- MENÚ PRINCIPAL ---");
		System.out.println("1. Iniciar sesión");
		System.out.println("2. Registrarse");
		System.out.println("3. Recuperar contraseña");
		System.out.println("4. Salir");
		Scanner sc =new Scanner(System.in);
		 n=sc.nextInt();
		 sc.close();
		 switch (n) {
		case 1: {
			System.out.println("Has elegido 'Iniciar Sesión'");
			break;
		}
		case 2: {
			System.out.println("Has elegido 'Registrarse'");
			break;
		}
		case 3: {
			System.out.println("Has elegido 'Recuperar contraseña'");
			break;
		}
		case 4: {
			System.out.println("Has elegido 'Salir'");
			break;
		}
		default:
			System.out.println("Numero inválido");
		}
	}
}
