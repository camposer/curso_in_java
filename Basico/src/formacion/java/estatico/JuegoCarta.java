package formacion.java.estatico;

public class JuegoCarta {
	public static void main(String[] args) {
		Carta[] cartas = new Carta[2];
		cartas[0] = new Carta(2, 99); // INCORRECTO!!
		cartas[1] = new Carta(3, Carta.COPAS);
		
		for (Carta carta : cartas) {
			System.out.println(carta);
		}
	}
}

class Carta {
	public static final int ESPADAS = 0;
	public static final int BASTOS = 1;
	public static final int OROS = 2;
	public static final int COPAS = 3;
	
	private int palo;
	private int numero;
	
	public Carta(int numero, int palo) {
		this.numero = numero;
		this.palo = palo;
	}

	public int getPalo() {
		return palo;
	}

	public void setPalo(int palo) {
		this.palo = palo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public static int getOros() {
		return OROS;
	}

	@Override
	public String toString() {
		String textoPalo = "ESPADAS";
		
		if (palo == BASTOS)
			textoPalo = "BASTOS";
		else if (palo == COPAS)
			textoPalo = "COPAS";
		else if (palo == OROS)
			textoPalo = "OROS";
		
		return "Carta [palo=" + textoPalo + ", numero=" + numero + "]";
	}
}
