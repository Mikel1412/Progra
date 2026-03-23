package ud9.ejercicios.ficha2;

public class Divisor {
//	Crea una clase Divisor que tenga un método dividir que tome como parámetros
//	dos números. Si el segundo es cero, lanza una excepción
//	DivisionPorCeroException.

	public int dividir(int n1, int n2) {
		if (n2 == 0) {
			throw new IllegalArgumentException("DivisionPorCeroException");
		} else {
			return n1 / n2;
		}
		
	}
}
