package ud10.ficha3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GestionProductos {
	private List<Producto> listaProductos;

	// CONSTRUCTOR
	public GestionProductos() {
		listaProductos = new ArrayList<Producto>();
	}

	public void agragarProducto(Producto producto) {
		listaProductos.add(producto);
	}

	public void eliminarProducto(int codigo) {
		Iterator<Producto> it = listaProductos.iterator();
		while (it.hasNext()) {
			if (it.next().getCodigo() == codigo) {
				it.remove();
			}
		}
	}

	public Producto obtenerProducto(int codigo) {
		Producto pr = null;
		for (Producto p : listaProductos) {
			if (p.getCodigo() == codigo) {
				pr = p;
			} else {
				pr = null;
			}
		}
		return pr;
	}

	public List<Producto> buscarProducto(String tipo) {
		List<Producto> productosTipo = new ArrayList<>();

		for (Producto p : listaProductos) {
			if (p.getTipo().equals(tipo)) {
				productosTipo.add(p);
			}
		}

		return productosTipo;
	}
	
	

	// GETTERS Y SETTERS
	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

}
