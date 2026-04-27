package ud10.ficha9;

public class Arbol extends Planta {
	private static final int MAX_AGUA = 100;

	private int edad;
	private HojasArbolTipo tipoHoja;

	// Constructor
	public Arbol(int edad, HojasArbolTipo tipoHoja, String nombre, int altura, boolean necesitaAgua) {
		super(nombre, altura, necesitaAgua, MAX_AGUA);
		this.edad = edad;
		this.tipoHoja = tipoHoja;
	}

	
	public void crecer() {
		double creciminetoBase = MAX_AGUA * 0.05;
		double reduccionEdad = this.edad * 0.2;

		double resultado = creciminetoBase - reduccionEdad;
		
		if(resultado <= 0) {
			resultado=0;
			this.edad++;
		} else { 
			this.edad++;
			this.setAltura(getAltura()+resultado);
			System.out.println("El arbol ha crecido " + resultado);
		}
	}
	

	public void regar(int cantidadAgua) throws RiegoExcesivoException {
		if(!isNecesitaAgua()) {
			throw new RiegoExcesivoException("La planta no necesita agua en este momento");
		}else {
			if(cantidadAgua>MAX_AGUA) {
				throw new RiegoExcesivoException("Cantidad de agua excesiva para esta planta");
			} else {
				this.setNecesitaAgua(true);
			}
		}
	}
	
	@Override
	public void mostrarInformacion() {
		super.mostrarInformacion();
        System.out.println("Tipo de hoja: " + tipoHoja);
	}

	// GETTERS Y SETTERS

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public HojasArbolTipo getTipoHoja() {
		return tipoHoja;
	}

	public void setTipoHoja(HojasArbolTipo tipoHoja) {
		this.tipoHoja = tipoHoja;
	}

	public static int getMaxAgua() {
		return MAX_AGUA;
	}

}
