package practicas;

import java.util.Scanner;

public class PruebasParaPracticas {
	public static void main(String[] args) {
		int n;

		//Estructura MisionInetrgalactica.java
		System.out.println("--- MENÚ PRINCIPAL ---");
		System.out.println("1. Iniciar sesión");
		System.out.println("2. Registrarse");
		System.out.println("3. Recuperar contraseña");
		System.out.println("0. Salir");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		while (n != 0) {
			switch (n) {
			case 1: {
				System.out.println("Has elegido 'Iniciar Sesión'");

				n = sc.nextInt();
				break;
			}
			case 2: {
				System.out.println("Has elegido 'Registrarse'");

				n = sc.nextInt();
				break;
			}
			case 3: {
				System.out.println("Has elegido 'Recuperar contraseña'");
				
				n = sc.nextInt();
				break;
			}
			case 0: {
				System.out.println("Has elegido 'Salir'");
				break;
			}
			default:
				System.out.println("Numero inválido");

				n = sc.nextInt();
			}
		}
		sc.close();
	}
}
