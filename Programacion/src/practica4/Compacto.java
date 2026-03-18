package practica4;

//Mikel Gómez

public class Compacto extends Vehiculos {
	private int precio = getPRECIO_BASE();
	private boolean ac;
	private Puertas puertas;
	

	// CONSTRUCTORES
	public Compacto() {
		super();
	}

	public Compacto(String matricula, boolean disponible, boolean ac, Puertas numP) {
		super(matricula, disponible);
		this.ac = ac;
		this.puertas=numP;
	}

	// METODOS
	@Override
	public void calcularCosteAlquiler() {
		this.precio = getPRECIO_BASE() * (115 / 100);
		if (ac) {
			this.precio += 3;
		}
	}

	@Override
	public String toString() {
		return "Compacto [puertas=" + puertas + ", precio=" + precio + ", ac=" + ac + "]";
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	
}
