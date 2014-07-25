package exception;

public class MenorQueCeroException extends CalculadoraException {
	private int numero;
	
	public MenorQueCeroException(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
