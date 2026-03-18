package practica4;

//Mikel Gómez

public class Premium extends Vehiculos {
	private boolean seguroATodoRiesgo;
	private int hp, precio;

	// CONSTRUCTORES
	public Premium() {
		super();
	}

	public Premium(String matricula, boolean disponible, int hp, boolean seguroATodoRiesgo) {
		super(matricula, disponible);
		this.hp = hp;
		this.seguroATodoRiesgo = seguroATodoRiesgo;
	}

	// METODOS
	@Override
	public void calcularCosteAlquiler() {

		this.precio = getPRECIO_BASE() * (140 / 100);
		if (seguroATodoRiesgo) {
			this.precio = getPRECIO_BASE() * (110 / 100);
		}
	}

	// TO String

	@Override
	public String toString() {
		return "Premium [seguroATodoRiesgo=" + seguroATodoRiesgo + ", hp=" + hp + ", precio=" + precio + "]";
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
