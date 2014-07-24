package formacion.java.clases;

public class Interfaces {
	public static void main(String[] args) {
		
	}
}

interface Voladores {
	public void despegar();
	public void aterrizar();
	public void volar();
}

class Avion implements Voladores {

	@Override
	public void despegar() {
		System.out.println("Despegando...");
	}

	@Override
	public void aterrizar() {
		System.out.println("Aterrizando...");
	}

	@Override
	public void volar() {
		System.out.println("Volando...");
	}
	
}