package ud8.ejercicios.ficha8;

import java.util.Scanner;

public class Invernadero {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int semana = 1, opcion=0;
		Verduras arrayVerduras[] = new Verduras[18];
		do {
		System.out.println("---MENU PRINCIPAL - SEMANA" + semana + "---");
		System.out.println("1.- Cosechar planta\r\n" + "2.- Nueva planta\r\n" + "3.- Informe del invernadero\r\n"
				+ "4.- Avanzar 1 semana\r\n" + "5.- Salir");
		opcion=leer.nextInt();
		
		
		switch (opcion) {
		case 1:
			
			break;
			
		case 2:
			int planta_tipo=0;
			System.out.println("Seleciona el tipo de verdura "
					+ "1.Tomate"
					+ "2.Lechuga");
			planta_tipo=leer.nextInt();
			if(planta_tipo==1) {
				System.out.println("Selecciona el tipo de tomate"
						+ "1.cherry"
						+ "2.pera"
						+ "3.kumato");
				planta_tipo=leer.nextInt();
				if(planta_tipo==1) {
					
				}else if(planta_tipo==2) {
					
				}else {
					
				}
			}else {
				
			}
			
			break;
			
		case 3:

			break;
			
		case 4:

			break;
			
		case 5:

			break;

		default:
			break;
		}
		}while(opcion!=5);
	}
}
