package dos;

public class Camioneta extends Vehiculo {
	private float tara;
	private float carga;

	public Camioneta() {
		System.out.println("Construyendo la Camioneta");
	}
	
	public Camioneta(String duenio, 
			int puertas, 
			int ruedas) {
		this(duenio, puertas, ruedas, 0f, 0f);
		System.out.println("Construyendo la Camioneta");
	}

	public Camioneta(String duenio, 
			int puertas, 
			int ruedas, 
			float tara,
			float carga) {
		super();
		this.duenio = duenio;
		this.puertas = puertas;
		this.ruedas = ruedas;
		this.tara = tara;
		this.carga = carga;
		System.out.println("Construyendo la Camioneta");
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Destruyendo la Camioneta");
	}

	public void caracteristicas() {
		System.out.println("[ dueño = " + duenio + 
				", puertas = " + puertas +
				", ruedas = " + ruedas +
				", tara = " + tara + 				
				", carga = " + carga + "]");
	}

	public float getTara() {
		return tara;
	}

	public void setTara(float tara) {
		this.tara = tara;
	}

	public float getCarga() {
		return carga;
	}

	public void setCarga(float carga) {
		this.carga = carga;
	}
	
	@Override
	public String toString() {
		return "[ dueño = " + duenio + 
				", puertas = " + puertas +
				", ruedas = " + ruedas +
				", tara = " + tara + 				
				", carga = " + carga + "]";
	}
}
