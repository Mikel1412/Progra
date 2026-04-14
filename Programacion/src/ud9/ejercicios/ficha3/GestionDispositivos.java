package ud9.ejercicios.ficha3;


public class GestionDispositivos {
	public static void main(String[] args) {
		
		Fabricante f1 = new Fabricante("Samsung", "Corea del Sur");
		Fabricante f2 = new Fabricante("Apple", "EEUU");

		
		Dispositivo[] dispositivos = new Dispositivo[4];

		dispositivos[0] = new Smartphone("Galaxy S23", "1.0.0", 900, f1, 4000);
		dispositivos[1] = new Smartphone("iPhone 14", "1.0.0", 1100, f2, 3500);
		dispositivos[2] = new Laptop("MacBook Pro", "2.0.0", 2000, f2, 16);
		dispositivos[3] = new Laptop("Samsung Book", "2.0.0", 1200, f1, 8);

		
		System.out.println("Número de fabricantes: " + Fabricante.mostrarNumFabricantes());

		System.out.println("\n--- DATOS DE LOS DISPOSITIVOS ---");
		
	}
}
