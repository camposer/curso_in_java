public abstract class JuegoSalon extends Juego {
	protected String instrumento1;
	protected String instrumento2;

	public JuegoSalon() {
		super(0);
	}

	public JuegoSalon(int numeroJugadores, String ganador, String instrumento1,
			String instrumento2) {
		super(numeroJugadores, ganador);
		this.instrumento1 = instrumento1;
		this.instrumento2 = instrumento2;
	}

	public String getInstrumento1() {
		return instrumento1;
	}

	public void setInstrumento1(String instrumento1) {
		this.instrumento1 = instrumento1;
	}

	public String getInstrumento2() {
		return instrumento2;
	}

	public void setInstrumento2(String instrumento2) {
		this.instrumento2 = instrumento2;
	}
}
