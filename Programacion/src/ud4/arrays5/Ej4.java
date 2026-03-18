package ud4.arrays5;

public class Ej4 {

	public static void main(String[] args) {
//		Dados dos arrays de 10 posiciones, los cuales se rellenarán con valores
//		aleatorios, los evaluaremos para finalmente crear un tercer array que
//		contenga solo los valores únicos de ambos arrays, es decir, aquellos que no
//		están repetidos
		int primerVector[] = new int[10], segundoVector[] = new int[10];
		int contadorNoRepetidos = 0;
		for (int i = 0; i < primerVector.length; i++) {
			primerVector[i] = (int) (Math.random() * 40);
			segundoVector[i] = (int) (Math.random() * 40);
		}

		System.out.println("PrimerVector:");
		for (int i = 0; i < primerVector.length; i++) {
			for (int j = 0; j < primerVector.length; j++) {
				if (i != j) {
					if (primerVector[i] != primerVector[j]) {
						contadorNoRepetidos++;
					}
				}
			}
			System.out.println(primerVector[i]);
		}

		for (int i = 0; i < primerVector.length; i++) {
			for (int j = 0; j < segundoVector.length; j++) {
				if (primerVector[i] != segundoVector[j]) {
					contadorNoRepetidos++;
				}
			}
		}

		System.out.println("Segundo vector");
		for (int i = 0; i < segundoVector.length; i++) {
			for (int j = 0; j < segundoVector.length; j++) {
				if (i != j) {
					if (segundoVector[i] != segundoVector[j]) {
						contadorNoRepetidos++;
					}
				}
			}
			System.out.println(segundoVector[i]);
		}

		int tercerVector[] = new int[contadorNoRepetidos];
		int contSumaVector = 0;

		for (int i = 0; i < primerVector.length; i++) {
			for (int j = 0; j < primerVector.length; j++) {
				if (i != j) {
					if (primerVector[i] != primerVector[j]) {
						tercerVector[contSumaVector] = primerVector[i];
						contSumaVector++;
					}
				}
			}
		}

		for (int i = 0; i < primerVector.length; i++) {
			for (int j = 0; j < segundoVector.length; j++) {
				if (primerVector[i] != segundoVector[j]) {
					tercerVector[contSumaVector] = primerVector[i];
					contSumaVector++;
				}
			}
		}

		for (int i = 0; i < segundoVector.length; i++) {
			for (int j = 0; j < segundoVector.length; j++) {
				if (i != j) {
					if (segundoVector[i] != segundoVector[j]) {
						tercerVector[contSumaVector] = segundoVector[i];
						contSumaVector++;
					}
				}
			}
		}
		System.out.println("Tercer Vector");
		for (int i = 0; i < tercerVector.length; i++) {
			System.out.println(tercerVector[i]);
		}

	}
}
