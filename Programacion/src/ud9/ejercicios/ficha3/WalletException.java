package ud9.ejercicios.ficha3;

public class WalletException extends Exception{
	public WalletException() {
		super("No se ha podido activar Wallet porque no se cumplen los requisitos necesarios");
	}
	
	public WalletException(String mensaje) {
		super(mensaje);
	}
}
