package uno;

public class Principal {
	public static void main(String[] args) {
		Persona a = new Persona("Juan", "Pérez", 40);
		Persona b = new Persona("María", "García", 30);
		Persona c = new Persona("Pedro", "López", 20);
		
		a.imprimir();
		b.imprimir();
		c.imprimir();
		
		a = b;
		c = b;

		a.setNombre("Mary");

		a.imprimir();
		b.imprimir();
		c.imprimir();

		a = b = c = null;
		
//		a = null;
//		b = null;
//		c = null;
		
//		a = new Persona();
//		b = a;
//		c = a;
		
//		b = null;
//		a = b;
//		c = b;

		a.imprimir();
	}
}
