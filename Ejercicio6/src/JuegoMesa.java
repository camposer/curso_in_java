
public abstract class JuegoMesa extends Juego {
	protected boolean mesa;
	protected boolean libreta;
	
	public JuegoMesa(int numeroJugadores, String ganador, boolean mesa,
			boolean libreta) {
		super(numeroJugadores, ganador);
		this.mesa = mesa;
		this.libreta = libreta;
	}
	
	public JuegoMesa() {
		super(0);
	}

	public boolean isMesa() {
		return mesa;
	}

	public void setMesa(boolean mesa) {
		this.mesa = mesa;
	}

	public boolean isLibreta() {
		return libreta;
	}

	public void setLibreta(boolean libreta) {
		this.libreta = libreta;
	}
}
