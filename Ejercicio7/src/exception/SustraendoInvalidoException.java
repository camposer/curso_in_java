package exception;

public class SustraendoInvalidoException extends CalculadoraException {
	private int numero;
	
	public SustraendoInvalidoException(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
}
