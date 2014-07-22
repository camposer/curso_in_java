package dos;

import uno.Persona;

public class Principal {
	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.imprimir(); // => null, García, 0
		//imprimir2(p1);
		
		Persona p2 = new Persona("Juan");
		p2.imprimir(); // => Juan, García, 0
		
		Persona p3 = new Persona("Juan", "Pérez");
		p3.imprimir(); // => Juan, Pérez, 0
		
		Persona p4 = new Persona("Juan", "Pérez", 40);
		p4.imprimir(); // => Juan, Pérez, 40
		p4.setApellido("Fulano");
		p4.imprimir();
		System.out.println("Sólo apellido: " + 
				p4.getApellido());
	}
	public static void imprimir2(Persona p) {
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Apellido: " + p.getApellido());
		System.out.println("Edad: " + p.getEdad());
		System.out.println();
	}
}
