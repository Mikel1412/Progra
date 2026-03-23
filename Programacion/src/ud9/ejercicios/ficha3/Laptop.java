package ud9.ejercicios.ficha3;

import java.io.IOException;
import java.util.Scanner;

public class Laptop extends Dispositivo {
	private int RAM;

	// CONSTRUCTOR

	public Laptop(String nombre, String versionFirmware, int precio, Fabricante fabricante, int RAM) {
		super(nombre, versionFirmware, precio, fabricante);
		this.RAM = RAM;
	}

	// METODOS

	@Override
	public void activarWallet() throws IOException {
		Scanner leer = new Scanner(System.in);
		String PIN;
		System.out.println("Introduce el pin");
		PIN = leer.nextLine();
		int dolar=0;
		if (PIN.length()==4) {
			for(int i = 0; i < PIN.length();i++) {
				if(PIN.charAt(i)=='$') {
					System.out.println("Wallet activado");
				}
			}
		} else {
			throw new IOException("WalletException");
		}
	}

	// GETTERS Y SETTERS
	public int getRAM() {
		return RAM;
	}

	public void setBateria(int RAM) {
		this.RAM = RAM;
	}
}
