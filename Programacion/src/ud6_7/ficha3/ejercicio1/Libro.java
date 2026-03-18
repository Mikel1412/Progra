package ud6_7.ficha3.ejercicio1;

public class Libro {
	private String titulo, autor;
	private int numeroEjemplares, numeroEjemplaresPrestados;
	
	
	public Libro() {
		this.titulo="";
		this.autor="";
		this.numeroEjemplares=0;
		this.numeroEjemplaresPrestados=0;
	}
	
	public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresPrestados) {
		this.titulo=titulo;
		this.autor=autor;
		this.numeroEjemplares=numeroEjemplares;
		this.numeroEjemplaresPrestados=numeroEjemplaresPrestados;
	}
	
	//Para el prestamo vamos a suponer que los ejemplares disponibles es igual a numeroEjemplares-numeroEjemplaresPrestados
	
	public boolean prestamo() {
		boolean prestamo;
		if((this.numeroEjemplares-this.numeroEjemplaresPrestados)>0) {
			this.numeroEjemplaresPrestados++;
			prestamo=true;
		}else {
			prestamo=false;
		}
		return prestamo;
	}
	
	public boolean devolucion() {
		boolean devolucion;
		if((this.numeroEjemplares-this.numeroEjemplaresPrestados)!=this.numeroEjemplares) {
			this.numeroEjemplaresPrestados--;
			devolucion=true;
		}else {
			devolucion=false;
		}
		return devolucion;
	}
	
	public String toString() {
		return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nNumero de ejemplares: " + this.numeroEjemplares + "\nNumero de ejemplares Prestados: " + this.numeroEjemplaresPrestados;
	}
	
	//Setters
	public void setTitulo(String titulo) {
		this.titulo=titulo;
	}
	
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public void setNumeroEjemplares(int numeroEjemplares) {
		this.numeroEjemplares=numeroEjemplares;
	}
	
	public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
		this.numeroEjemplaresPrestados=numeroEjemplaresPrestados;
	}
	
	//Getters
	public String getTitulo() {
		return titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public int getNumeroEjemplares() {
		return numeroEjemplares;
	}

	public int getNumeroEjemplaresPrestados() {
		return numeroEjemplaresPrestados;
	}
	
	
}
