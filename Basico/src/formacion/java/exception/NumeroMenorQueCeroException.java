package formacion.java.exception;

public class NumeroMenorQueCeroException extends Exception {
	private int numero;
	
	public NumeroMenorQueCeroException(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
}
