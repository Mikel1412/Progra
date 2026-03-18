package practicas;

import java.io.IOException;
import java.util.Scanner;

public class MisionIntergalactica {
	public static void main(String[] args) throws IOException {

		int opcionMenu, energiaEstelar = 0, nivelPotencia, adivinarPotencia;
		boolean motores = false, destino = false;

		// generamos un nivel de potencia aleatorio con un valor entero para que sea
		// distinto en cada caso
		nivelPotencia = (int) (1 + Math.random() * (100 - 1 + 1));

		// Menu de inicio
		System.out.println("--- CENTRO DE CONTROL ---");
		System.out.println("1. Calibrar los motores de la nave");
		System.out.println("2. Introducir coordenadas de destino");
		System.out.println("3. Mostrar energía estelar acumulada");
		System.out.println("4. Iniciar el salto interestelar");
		System.out.println("5. Tripulación registrada");
		System.out.println("6. Diagnóstico del sistema");
		System.out.println("0. Salir");

		Scanner leer = new Scanner(System.in);
		opcionMenu = leer.nextInt();

		// Hacemos un switch para hacer distintas cosas dependiendo de lo que haga el
		// usuario
		// Preguntamos que es lo siguiente que quiere hacer el usuario antes del break
		// de cada switch para que no se salga al momento
		while (opcionMenu != 0) {
			switch (opcionMenu) {
			case 1: {
				int numeroIntentosPotencia = 0;

				// Hacemos un while para que se repita
				do {
					System.out.println("Introduce el nivel correcto de potencia para ganar 10 de energia estelar");
					adivinarPotencia = leer.nextInt();

					if (adivinarPotencia == nivelPotencia) {
						System.out.println("¡Has acertado el nivel de potencia!");
						energiaEstelar += 10;
						System.out.println("Numero intentos totales:" + numeroIntentosPotencia);
						motores = true;

					} else if (adivinarPotencia > nivelPotencia) {
						System.out.println("El nivel de potencia es menor al introducido");
						numeroIntentosPotencia++;
					} else if (adivinarPotencia < nivelPotencia) {
						System.out.println("El nivel de potencia es mayor al intoducido");
						numeroIntentosPotencia++;
					}
				} while (adivinarPotencia != nivelPotencia);

				System.out.println("--- CENTRO DE CONTROL ---");
				System.out.println("1. Calibrar los motores de la nave");
				System.out.println("2. Introducir coordenadas de destino");
				System.out.println("3. Mostrar energía estelar acumulada");
				System.out.println("4. Iniciar el salto interestelar");
				System.out.println("5. Tripulación registrada");
				System.out.println("6. Diagnóstico del sistema");
				System.out.println("0. Salir");
				opcionMenu = leer.nextInt();
				break;
			}
			case 2: {
				int cCuadrante = 0, añoDestino = 0;
				char cSector;
				
				do {
				System.out.println("Introduce las coordenadas galacticas pera el sector (A-Z)");
				cSector = (char) System.in.read();
				System.out.println("Introduce las coordenadas galacticas pera el cuadrante (1-10)");
				cCuadrante = leer.nextInt();
				System.out.println("Introduce las coordenadas galacticas pera el año(>2200)");
				añoDestino = leer.nextInt();
				} while (añoDestino <= 2200 || cCuadrante <= 0 || cCuadrante > 10|| cSector  < 'A' || cSector > 'Z');

				
					if (añoDestino > 2200 && cCuadrante > 0 && cCuadrante <= 10 &&  cSector >= 'A' && cSector <= 'Z') {
						System.out.println("Coordenadas cargadas con éxito. Nave lista para el salto.");
						energiaEstelar += 5;
						destino = true;
					} else {
						System.out.println("Coordenadas incorrectas. Reintenta la entrada.");
						
						System.out.println("Introduce las coordenadas galacticas pera el sector (A-Z)");
						cSector = (char) System.in.read();
						System.out.println("Introduce las coordenadas galacticas pera el cuadrante (1-10)");
						cCuadrante = leer.nextInt();
						System.out.println("Introduce las coordenadas galacticas pera el año(>2200)");
						añoDestino = leer.nextInt();
					}
								
				System.out.println("--- CENTRO DE CONTROL ---");
				System.out.println("1. Calibrar los motores de la nave");
				System.out.println("2. Introducir coordenadas de destino");
				System.out.println("3. Mostrar energía estelar acumulada");
				System.out.println("4. Iniciar el salto interestelar");
				System.out.println("5. Tripulación registrada");
				System.out.println("6. Diagnóstico del sistema");
				System.out.println("0. Salir");
				opcionMenu = leer.nextInt();
				break;
			}
			case 3: {

				System.out.println("Tu energia estalar acual es de " + energiaEstelar + " unidades");

				System.out.println("--- CENTRO DE CONTROL ---");
				System.out.println("1. Calibrar los motores de la nave");
				System.out.println("2. Introducir coordenadas de destino");
				System.out.println("3. Mostrar energía estelar acumulada");
				System.out.println("4. Iniciar el salto interestelar");
				System.out.println("5. Tripulación registrada");
				System.out.println("6. Diagnóstico del sistema");
				System.out.println("0. Salir");
				opcionMenu = leer.nextInt();
				break;
			}
			case 4: {

				if (motores == true && destino == true && energiaEstelar > 9) {

				}

				System.out.println("--- CENTRO DE CONTROL ---");
				System.out.println("1. Calibrar los motores de la nave");
				System.out.println("2. Introducir coordenadas de destino");
				System.out.println("3. Mostrar energía estelar acumulada");
				System.out.println("4. Iniciar el salto interestelar");
				System.out.println("5. Tripulación registrada");
				System.out.println("6. Diagnóstico del sistema");
				System.out.println("0. Salir");
				opcionMenu = leer.nextInt();
				break;
			}
			case 5: {

				System.out.println("--- CENTRO DE CONTROL ---");
				System.out.println("1. Calibrar los motores de la nave");
				System.out.println("2. Introducir coordenadas de destino");
				System.out.println("3. Mostrar energía estelar acumulada");
				System.out.println("4. Iniciar el salto interestelar");
				System.out.println("5. Tripulación registrada");
				System.out.println("6. Diagnóstico del sistema");
				System.out.println("0. Salir");
				opcionMenu = leer.nextInt();
				break;
			}
			case 6: {

				System.out.println("--- CENTRO DE CONTROL ---");
				System.out.println("1. Calibrar los motores de la nave");
				System.out.println("2. Introducir coordenadas de destino");
				System.out.println("3. Mostrar energía estelar acumulada");
				System.out.println("4. Iniciar el salto interestelar");
				System.out.println("5. Tripulación registrada");
				System.out.println("6. Diagnóstico del sistema");
				System.out.println("0. Salir");
				opcionMenu = leer.nextInt();
				break;
			}
			case 0: {

				System.out.println("Cerrando sistemas de navegación... ¡Hasta el próximo viaje, piloto");

				break;
			}
			default: {
				// Para no sacar directamente al usuario si se ha equivocado le decimos que el
				// numero es incorrecto y le volvemos a preguntar
				System.out.println("Numero inválido, vuelve a intoducir un numero");
				opcionMenu = leer.nextInt();
			}
			}
		}
		leer.close();
		System.out.println("Has salido del programa");
	}
}
