package ud9.ejercicios.ficha3;

import java.io.IOException;
import java.util.Scanner;

public class Smartphone extends Dispositivo {
	private int bateria;

	// CONSTRUCTOR

	public Smartphone(String nombre, String versionFirmware, int precio, Fabricante fabricante, int bateria) {
		super(nombre, versionFirmware, precio, fabricante);
		this.bateria = bateria;
	}

	// METODOS

	@Override
	public void activarWallet() throws IOException{
		Scanner leer = new Scanner(System.in);
		boolean biometria;
		String pregunta;
		System.out.println("El smartphone tiene biometria?(S ó N)");
		pregunta=leer.nextLine();
		if(pregunta.equals("S")) {
			biometria=true;
		}else {
			biometria=false;
		}
		
		
		if (biometria) {
			System.out.println("Wallet activado");
		} else {
			throw new IOException("WalletException");
		}
	}

	// GETTERS Y SETTERS
	public int getBateria() {
		return bateria;
	}

	public void setBateria(int bateria) {
		this.bateria = bateria;
	}

}
