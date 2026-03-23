package ud9.ejercicios.ficha2;

import java.util.Scanner;

public class Banco {
//	Crea una clase Banco que tenga una lista de cuentas bancarias. Implementa un
//	método retirarDinero que tome como parámetros una cuenta bancaria y una
//	cantidad de dinero a retirar. Si la cuenta no tiene suficiente dinero, lanza una
//	excepción personalizada SaldoInsuficienteException.

	public int cuentaBancaria;
	public int saldo;

	public Banco(int cuentaBancaria, int saldo) {
		this.cuentaBancaria = cuentaBancaria;
		this.saldo = saldo;
	}

	public void retirarDinero(int cantidadDinero) {
		if (this.saldo < cantidadDinero) {
			throw new IllegalArgumentException("SaldoInsuficienteException");
		} else {
			this.saldo -= cantidadDinero;
		}
	}

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		Banco cuenta1 = new Banco(12341, 98);
		cuenta1.retirarDinero(100);
		System.out.println(cuenta1.saldo);
		leer.close();
	}
}
