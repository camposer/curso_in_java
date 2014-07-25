
public abstract class Juego {
	protected int numeroJugadores;
	protected String ganador;
	
	public Juego(int numeroJugadores, String ganador) {
		this.numeroJugadores = numeroJugadores;
		this.ganador = ganador;
	}
	
	public Juego(int numeroJugadores) {
		super(); // Autogenerada sino está
		this.numeroJugadores = numeroJugadores;
	}
	
	public abstract void jugarJuego();
	public abstract int marcarTanto(int marcador);

	public int getNumeroJugadores() {
		return numeroJugadores;
	}

	public void setNumeroJugadores(int numeroJugadores) {
		this.numeroJugadores = numeroJugadores;
	}

	public String getGanador() {
		return ganador;
	}

	public void setGanador(String ganador) {
		this.ganador = ganador;
	}
}


