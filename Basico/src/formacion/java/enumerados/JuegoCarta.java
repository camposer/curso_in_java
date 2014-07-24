package formacion.java.enumerados;

public class JuegoCarta {
	public static void main(String[] args) {
		Carta[] cartas = new Carta[2];
		cartas[0] = new Carta(2, Palo.ESPADAS); 
		cartas[1] = new Carta(3, Palo.OROS);
		
		imprimir(cartas);
	}

	private static void imprimir(Carta[] cartas) {
		for (Carta carta : cartas) {
			System.out.println("Posición: " + 
					carta.getPalo().ordinal());
			System.out.println("Nombre: " + 
					carta.getPalo().name());
			System.out.println("Nombre: " + 
					carta.getPalo().id());
			System.out.println("Nombre: " + 
					carta.getPalo().nombreIngles());
			System.out.println();
		}
	}
}

enum Palo {
	ESPADAS(455, "Swords"), 
	BASTOS(200, "Clubs"), 
	OROS(300, "Coins"), 
	COPAS(900, "Cups");
	
	private int id;
	private String nombreIngles;
	
	private Palo(int id, String nombreIngles) {
		this.id = id;
		this.nombreIngles = nombreIngles;
	}
	
	public int id() {
		return id;
	}
	public String nombreIngles() {
		return nombreIngles;
	}
}

class Carta {
	private int numero;
	private Palo palo;
	
	public Carta(int numero, Palo palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public Palo  getPalo() {
		return palo;
	}

	public void setPalo(Palo palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Carta [palo=" + palo + ", numero=" + numero + "]";
	}
}

