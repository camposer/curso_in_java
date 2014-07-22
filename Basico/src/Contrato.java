public class Contrato {
	private int numero = 99;
	private String nombreCto = "N/D";
	private int duracion; // en días
	
	public Contrato() {
		this(0);
		numero = 90;
	}
	
	public Contrato(int duracion) {
		this(99, "N/D", duracion); // Llamada al constructor de abajo
	}
	
	public Contrato(int numero, String nombreCto, 
			int duracion) {
		this.numero = numero;
		this.nombreCto = nombreCto;
		this.duracion = duracion;
	}
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombreCto() {
		return nombreCto;
	}
	public void setNombreCto(String nombreCto) {
		this.nombreCto = nombreCto;
	}
	public int getDuracion() {
		return duracion;
	}
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	public void imprimirDetalles() {
		System.out.println("Número: " + numero);
		System.out.println("Nombre: " + nombreCto);
		System.out.println("Duración: " + duracion);
	}
	
	
}
