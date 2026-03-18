package ud8.ejercicios.ficha2;

public class Lavadora extends Electrodomestico{
	private int carga;
	private final int CARGA_DEFECTO=5;
	
	public Lavadora() {
		this.carga=CARGA_DEFECTO;
	}
	
	public Lavadora(int peso,int precio) {
		super(peso,precio);
		this.carga=CARGA_DEFECTO;
	}
	
	public Lavadora(int carga,int peso, int precio, char consumo, String color) {
		super(peso,precio,consumo,color);
		this.carga=carga;
	}
	//METODOS
	public int precioFinal() {
		int precioFinal;
		precioFinal=precioFinal();
		if(this.carga>30) {
			precioFinal+=50;
		}
		return precioFinal;
	}
	
	//GETTERS Y SETTERS
	public int getCarga() {
		return carga;
	}
	
	
}
