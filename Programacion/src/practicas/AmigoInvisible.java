package practicas;

import java.util.Scanner;

public class AmigoInvisible {
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numeroParticipantes;
		boolean correcto = true;

		System.out.println("Cuantas personas participarán en el amigo invisible?");
		numeroParticipantes = leer.nextInt();
		leer.nextLine();
		String participantes[] = new String[numeroParticipantes];
		for (int i = 0; i < participantes.length; i++) {
			String primeraLetra="";
			do {
				System.out.println("Introduce el nombre del participante numero " + (i + 1));
				participantes[i] = leer.nextLine();
				if (participantes[i].trim().equals("")) {
					System.out.println("Nombre invalido, vuelve a introducirlo");
					correcto = false;
				} else {
					System.out.println("Introdce al siguiente participante");
					correcto = true;
					primeraLetra=participantes[i].charAt(0)+"";
					participantes[i]=participantes[i].replaceFirst(primeraLetra,primeraLetra.toUpperCase());
					System.out.println(participantes[i]);
				}
			} while (correcto == false);
		}
		int colorYRegalo[][] = new int[2][4];
		for (int i = 0;i<colorYRegalo.length;i++) {
			for (int j = 0; j< colorYRegalo[i].length;i++) {
				
			}
		}
	
	}
}
