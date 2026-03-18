package ud8.ejercicios.ficha8;

public class Tomate extends Verduras{
	private static final double PRECIO_SEMANA = .5;

	private TipoTomates tipo;
	private MadurezTomates madurez;
	private double costoCultivo;

	// constructores

	public Tomate(TipoTomates tipo) {
		this.tipo = tipo;
		calcularMadurez();
	}

	// METODOS
	public double costoCultivo() {
		return this.tiempoPlantado * PRECIO_SEMANA;
	}

	public int precioVenta() {
		int precio;
		if (this.tipo == TipoTomates.CHERRY) {
			precio = 6;
		} else if (this.tipo == TipoTomates.PERA) {
			precio = 4;
		} else {
			precio = 7;
		}
		return precio;
	}

	public void calcularMadurez() {
		if (this.tiempoPlantado <= 3) {
			this.madurez = MadurezTomates.VERDE;
		} else if (this.tiempoPlantado <= 6) {
			this.madurez = MadurezTomates.MADURANDO;
		} else {
			this.madurez = MadurezTomates.MADURO;
		}
	}
	//GETTERS Y SETERS

	public TipoTomates getTipo() {
		return tipo;
	}

	public static double getPrecioSemana() {
		return PRECIO_SEMANA;
	}

	public void setTipo(TipoTomates tipo) {
		this.tipo = tipo;
	}

	public MadurezTomates getMadurez() {
		return madurez;
	}

	public void setMadurez(MadurezTomates madurez) {
		this.madurez = madurez;
	}

	public double getCostoCultivo() {
		return costoCultivo;
	}

	public void setCostoCultivo(double costoCultivo) {
		this.costoCultivo = costoCultivo;
	}
	
	

}
