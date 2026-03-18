package ud8.ejercicios.ficha2;

public class Television extends Electrodomestico{
	private int resolucion;
	private boolean tdt;
	private final int RESOLUCION_DEFECTO=20;
	private final boolean TDT_DEFECTO=false;
	
	public Television() {
		super();
		this.resolucion=RESOLUCION_DEFECTO;
		this.tdt=TDT_DEFECTO;
	}
	
	public Television(int precio, int peso) {
		super(precio,peso);
		this.resolucion=RESOLUCION_DEFECTO;
		this.tdt=TDT_DEFECTO;
	}
	
	public Television(int resolucion,boolean tdt,int peso, int precio, char consumo, String color ) {
		super(peso,precio,consumo,color);
		this.resolucion=resolucion;
		this.tdt=tdt;
	}
	//Metodos
	public int precioFinal() {
		int precioFinal=precioFinal();
		if(resolucion>30) {
			precioFinal=precioFinal+((precioFinal*13)/10);
		}
		
		if(isTdt()) {
			precioFinal+=50;
		}
		return precioFinal;
	}
	
	
	//GETTERS
	public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}
	
	

	
}
