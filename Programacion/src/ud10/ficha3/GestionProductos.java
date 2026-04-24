package ud10.ficha3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class GestionProductos {
	private List<Producto> listaProductos;

	// CONSTRUCTOR
	public GestionProductos() {
		listaProductos = new ArrayList<Producto>();
	}

	//METODOS
	
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

	public int tamanio() {
		return listaProductos.size();
	}

	public void agregarSinDuplicados(int codigo, Producto producto) {
		Iterator<Producto> it = listaProductos.iterator();
		boolean duplicado = false;
		while (it.hasNext()) {
			if (it.next().getCodigo() == codigo) {
				duplicado = true;
			}
		}

		if (!duplicado) {
			listaProductos.add(producto);
		}
	}

	public void aumentarPrecio(String tipo, int porcentaje) {
		for (Producto p : listaProductos) {
			if (p.getTipo().equals(tipo)) {
				p.setPrecio(p.getPrecio() * (1 + porcentaje / 100));
			}
		}
	}

	public void eliminarSinStock() {
		Iterator<Producto> it = listaProductos.iterator();
		while (it.hasNext()) {
			if (it.next().getStock() == 0) {
				it.remove();
			}
		}
	}

	// GETTERS Y SETTERS
	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

}
