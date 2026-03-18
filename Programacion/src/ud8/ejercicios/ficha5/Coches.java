package ud8.ejercicios.ficha5;

public class Coches extends Vehiculo{
	private int pasajeros, ruedas;
	private String color;
	private boolean descapotable;
	private static final int RUEDAS=4;

	public Coches() {

	}

	public Coches(String matricula, String marca, int año, int autonomia,int ruedas, String color, int pasajeros, boolean descapotable) {
		super(matricula, marca, año, autonomia);
		this.ruedas=RUEDAS;
		this.color = color;
		this.descapotable = descapotable;
		this.pasajeros = pasajeros;
	}

	
	//GETTERS Y SETTERS
	
	public int getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(int pasajeros) {
		this.pasajeros = pasajeros;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}

	//TO STRING
	
	public String listar() {
		return "Coches [pasajeros=" + pasajeros + ", ruedas=" + ruedas + ", color=" + color + ", descapotable="
				+ descapotable + ", toString()=" + super.toString() + "]";
	}
	
	//METODOS
	
	public void pintar(String color) {
		this.color=color;
	}
}
