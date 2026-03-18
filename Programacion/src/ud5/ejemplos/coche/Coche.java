package ud5.ejemplos.coche;

public class Coche {
	//Atributos
	public String color;
	public String marca;
	public int velocidad;
	
	//Metodos
	public void arrancar() {
		System.out.println("Coche arrancado");
		velocidad=10;
	}
	public void frenar() {
		System.out.println("Freno el coche");
		velocidad=0;
	}
	public void acelerar(int acelero) {
		System.out.println("Acelero el coche");
		velocidad+=acelero;
	}
}
