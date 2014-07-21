
public class TestContrato {
	public static void main(String[] args) {
		Contrato c1 = new Contrato();
		c1.setNumero(1);
		c1.setNombreCto("Pilar");
		c1.setDuracion(24);
		c1.imprimirDetalles();
		System.out.println(); // => Línea en blanco
		
		Contrato c2 = new Contrato();
		c2.setNumero(2);
		c2.setNombreCto("José");
		c2.setDuracion(36);
		c2.imprimirDetalles();
	}
}
