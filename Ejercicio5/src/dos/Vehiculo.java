package dos;

public class Vehiculo {
	protected String duenio;
	protected int puertas;
	protected int ruedas;
	
	public Vehiculo() {
		System.out.println("Construyendo Vehiculo");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destruyendo Vehiculo");
	}
	
	public void caracteristicas() {
		System.out.println("[ dueño = " + duenio + 
				", puertas = " + puertas +
				", ruedas = " + ruedas + "]");
	}

	public String getDuenio() {
		return duenio;
	}

	public void setDuenio(String duenio) {
		this.duenio = duenio;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	
	@Override
	public String toString() {
		return "[ dueño = " + duenio + 
				", puertas = " + puertas +
				", ruedas = " + ruedas + "]";
	}
}
