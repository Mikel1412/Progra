package ud8.ejemplos;

public class Consultor extends Trabajador{
	private int numHoras;
	private double tarifa;
	
	public Consultor(String nombre, String nss, int numHoras, double tarifa) {
		super(nombre,nss);
		this.numHoras=numHoras;
		this.tarifa=tarifa;
	}
	
	//metodos
	
	public void sueldo() {
		double salarioFinal=this.tarifa*this.numHoras;
		System.out.println("El sueldo de " + this.getNombre() + " es " + salarioFinal);
	}
	
	//getters y setters

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	//tostring
	
	@Override
	public String toString() {
		return super.toString() + "Consultor [numHoras=" + numHoras + ", tarifa=" + tarifa + "]";
	}
}
