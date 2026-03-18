package ud8.ejemplos;

public class Empleado extends Trabajador{
	private double salario;
	private int irpf;
	
	public Empleado(String nombre, String nss) {
		super(nombre, nss);
	}
	
	public Empleado(String nombre, String nss, double salario, int irpf) {
		super(nombre, nss);
		this.salario=salario;
		this.irpf=irpf;
	}
	
	//metodos
	public void sueldo() {
		double salarioFinal=this.getSalario()-this.getSalario()*this.getIrpf()/100;
		System.out.println("El sueldo de " + this.getNombre() + " es " + salarioFinal);
	}
	
	//tostring

	@Override
	public String toString() {
		return super.toString() + "Empleado [salario=" + salario + ", irpf=" + irpf + "]";
	}

	//getters y setters
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getIrpf() {
		return irpf;
	}

	public void setIrpf(int irpf) {
		this.irpf = irpf;
	}
	
	
}
