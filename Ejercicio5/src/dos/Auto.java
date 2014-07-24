package dos;

public class Auto extends Vehiculo {
	private boolean descapotable;

	public Auto() {
		System.out.println("Construyendo el Auto");
	}
	
	public Auto(String duenio, 
			int puertas, 
			int ruedas) {
		this(duenio, puertas, ruedas, false);
		System.out.println("Construyendo el Auto");
	}

	public Auto(String duenio, 
			int puertas, 
			int ruedas, 
			boolean descapotable) {
		super();
		this.duenio = duenio;
		this.puertas = puertas;
		this.ruedas = ruedas;
		this.descapotable = descapotable;
		System.out.println("Construyendo el Auto");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destruyendo el Auto");
	}

	public boolean isDescapotable() {
		return descapotable;
	}

	public void setDescapotable(boolean descapotable) {
		this.descapotable = descapotable;
	}
	
	public void caracteristicas() {
		System.out.println("[ dueño = " + duenio + 
				", puertas = " + puertas +
				", ruedas = " + ruedas + 
				", descapotable = " + descapotable + "]");
	}
}
