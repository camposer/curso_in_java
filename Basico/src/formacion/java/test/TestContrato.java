package formacion.java.test;

import formacion.java.holamundo.Contrato;

public class TestContrato {
	public static void main(String[] args) {
		Contrato c0 = new Contrato();
		c0.imprimirDetalles(); // => 90, N/D, 0
		System.out.println();
		
		Contrato c1 = new Contrato(1, "Pilar", 24);
		//c1.setNumero(1);
		//c1.setNombreCto("Pilar");
		//c1.setDuracion(24);
		c1.imprimirDetalles(); // => 1, Pilar, 24
		System.out.println(); // => Línea en blanco
		
		Contrato c2 = new Contrato(36); // => 99, N/D, 36
		c2.setNumero(2); // => 2, N/D, 36
		c2.setNombreCto("José"); // => 2, José, 36
		//c2.setDuracion(36);
		c2.imprimirDetalles();
	}
}
