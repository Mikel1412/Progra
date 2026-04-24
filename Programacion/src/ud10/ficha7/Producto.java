package ud10.ficha7;

public class Producto {
	private int stock;
	private String nombre;
	private double precio;
	
	//CONSTRUCTOR
	public Producto(int stock,String nombre,double precio) {
		this.nombre=nombre;
		this.stock=stock;
		this.precio=precio;
	}

	//GETTERS Y SETTERS
	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
