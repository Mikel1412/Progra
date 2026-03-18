package ud8.ejercicios.ficha8;

public class Lechuga extends Verduras{
	private static final double PRECIO_SEMANA=.3;
	
	private TipoLechuga tipo;
	private MadurezLechuga madurez;
	private double costoCultivo;
	
	// constructores

		public Lechuga(TipoLechuga tipo) {
			this.tipo = tipo;
			calcularMadurez();
		}

	
	// METODOS
		public double costoCultivo() {
			return this.tiempoPlantado * PRECIO_SEMANA;
		}

		public double precioVenta() {
			double precio;
			if (this.tipo == TipoLechuga.ROMANA) {
				precio = 2;
			} else if (this.tipo == TipoLechuga.ICEBERG) {
				precio = 3;
			} else {
				precio = 2.5;
			}
			return precio;
		}
		
		public void calcularMadurez() {
			if (this.tiempoPlantado <= 2) {
				this.madurez = MadurezLechuga.TIERNA;
			} else if (this.tiempoPlantado <= 4) {
				this.madurez = MadurezLechuga.CRECIMIENTO;
			} else {
				this.madurez = MadurezLechuga.LISTA_COSECHA;
			}
		}

		//GETTERS Y SETTERS
		
		public TipoLechuga getTipo() {
			return tipo;
		}

		public static double getPrecioSemana() {
			return PRECIO_SEMANA;
		}

		public void setTipo(TipoLechuga tipo) {
			this.tipo = tipo;
		}

		public MadurezLechuga getMadurez() {
			return madurez;
		}

		public void setMadurez(MadurezLechuga madurez) {
			this.madurez = madurez;
		}

		public double getCostoCultivo() {
			return costoCultivo;
		}

		public void setCostoCultivo(double costoCultivo) {
			this.costoCultivo = costoCultivo;
		}
	
		
		
		
}
