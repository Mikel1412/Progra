package ud10.ficha3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 int opcionMenu=0;
		 do {
			 switch (opcionMenu) {
				case 1: {
					

					System.out.println("--- CENTRO DE CONTROL ---");
					System.out.println("1. Calibrar los motores de la nave");
					System.out.println("2. Introducir coordenadas de destino");
					System.out.println("3. Mostrar energía estelar acumulada");
					System.out.println("4. Iniciar el salto interestelar");
					System.out.println("5. Tripulación registrada");
					System.out.println("6. Diagnóstico del sistema");
					System.out.println("0. Salir");
					opcionMenu = sc.nextInt();
					break;
				}
				case 2: {
					
					break;
				}
				case 3: {

					
					break;
				}
				case 4: {

					
					break;
				}
				case 5: {

					
					break;
				}
				case 6: {

				
					break;
				}
				case 9: {

					System.out.println("Saliendo del programa...");

					break;
				}
				default: {
					System.out.println("Numero inválido, vuelve a intoducir un numero");
					opcionMenu = sc.nextInt();
					break;
				}
			 }
		 }while(opcionMenu!=9);
	}
		 }
