package ud8.ejercicios.ficha5;

public class Camiones extends Vehiculo{
	private int limiteCarga, carga, ruedas;
	private String conductor;
	
	public Camiones() {
		
	}
	
	public Camiones(String matricula, String marca, int año, int autonomia, int ruedas,int limiteCarga, int carga, String conductor) {
		super(matricula, marca, año, autonomia);
		this.ruedas=ruedas;
		this.limiteCarga=limiteCarga;
		this.carga=this.comprobarCarga(carga);
		this.conductor=conductor;
	}
	
	//GETTERS Y SETTERS
	

	public int getLimiteCarga() {
		return limiteCarga;
	}

	public void setLimiteCarga(int limiteCarga) {
		this.limiteCarga = limiteCarga;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	
	//To String
	public String listar() {
		return "Camiones [limiteCarga=" + limiteCarga + ", carga=" + carga + ", ruedas=" + ruedas + ", conductor="
				+ conductor + ", toString()=" + super.toString() + "]";
	}	
	
	//METODOS
	
	public int comprobarCarga(int carga) {
		int cargaCorregido;
		if (this.limiteCarga < carga) {
			cargaCorregido=limiteCarga;
		}else {
			cargaCorregido=carga;
		}
		return cargaCorregido;
	}
	
	public void cambiarConductor(String conductor) {
		this.conductor=conductor;
	}
	
	public void cargar(int incrementoCarga) {
		if((this.carga+incrementoCarga)>this.limiteCarga) {
			this.carga=limiteCarga;
		}else {
			this.carga+=incrementoCarga;
		}
	}
	
	public void descargar(int decrementoCarga) {
		if((this.carga-decrementoCarga)<0) {
			this.carga=0;
		}else {
			this.carga-=decrementoCarga;
		}
	}
}
