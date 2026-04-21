package ud10.ficha7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ej2 {
	public static void main(String[] args) {

		Producto prod1 = new Producto(10, "Teclado", 32);
		Producto prod2 = new Producto(12, "Cascos", 26);
		Producto prod3 = new Producto(13, "Pantalla", 223);
		Producto prod4 = new Producto(16, "Raton", 22);
		Producto prod5 = new Producto(11, "Alfombrilla", 3);

		Map<String, Producto> productos = new HashMap<>();
		
		productos.put(prod1.getNombre(), prod1);
		productos.put(prod2.getNombre(), prod2);
		productos.put(prod3.getNombre(), prod3);
		productos.put(prod4.getNombre(), prod4);
		productos.put(prod5.getNombre(), prod5);

		double mediaPrecio = 0;
		double mediaStock = 0;

		for (Entry<String, Producto> a : productos.entrySet()) {
			mediaPrecio = mediaPrecio + a.getValue().getPrecio();
			mediaStock = mediaStock + a.getValue().getStock();
		}
		System.out.println();
		System.out.println("La media de la Precio es " + mediaPrecio/productos.size());
		System.out.println("La media de la Stock es " + mediaStock/productos.size());
		
		
	}
}
