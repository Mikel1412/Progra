package ud5.ejemplos.coche;

public class Concesionario {
	public static void main(String[] args) {

		// instanciar una clase=crear un objeto
		Coche c1 = new Coche();
		
		c1.color="negro";
		c1.marca="VolksWagen";
		c1.velocidad=0;
		
		System.out.println(c1.velocidad);
		
		c1.acelerar(50);
		
		System.out.println(c1.velocidad);
	}
}
