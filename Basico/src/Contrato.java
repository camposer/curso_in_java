public class Contrato {
	private int numero;
	private String nombreCto;
	private int duracion; // en días
	
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
