package ud10.ficha9;

public class Flor extends Planta{
	private static final int MAX_AGUA = 50;
	private String color;
	
	//Constructor
	public Flor(String color ,String nombre, int altura, boolean necesitaAgua) {
		super(nombre, altura, necesitaAgua, MAX_AGUA);
		this.color=color;
	}


	public void crecer() {
		double crecimiento = MAX_AGUA*0.1;
		this.setAltura(getAltura()+crecimiento);
		this.setNecesitaAgua(true);
		System.out.println("La flor " + getIDPlanta() + " ha crecido " + crecimiento);
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
	
}
