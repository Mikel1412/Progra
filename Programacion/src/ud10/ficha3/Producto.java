package ud10.ficha3;

public class Producto {
	//ATRIBUTOS
	private int codigo, stock;
	private String nombre,tipo;
	private double precio;
	
	//CONTRUCTOR
	public Producto(int codigo, int stock, String nombre, String tipo, double precio) {
		this.codigo=codigo;
		this.stock=stock;
		this.nombre=nombre;
		this.tipo=tipo;
		this.precio=precio;
	}
	
	//GETTERS Y SETTERS

	public int getCodigo() {
		return codigo;
	}
 
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
