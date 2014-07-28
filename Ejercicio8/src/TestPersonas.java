import java.util.HashSet;
import java.util.Set;


public class TestPersonas {
	public static void main(String[] args) {
		sinGenerico();
		conGenerico();
	}

	private static void conGenerico() {
		Set<Persona> personas = new HashSet<Persona>();
		personas.add(new Persona());
		personas.add(new Persona("Juan"));
		personas.add(new Persona("María", "Pérez"));
		personas.add(new Persona("José", "García", 33));
//		personas.add(new A()); // FALLA!
		
		Persona p = new Persona();
		p.setNombre("Erica");
		p.setApellido("Barrios");
		p.setEdad(44);
		
		personas.add(p);
		
		for (Persona p1 : personas) {
			p1.imprimir();
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void sinGenerico() {
		Set personas = new HashSet();
		personas.add(new Persona());
		personas.add(new Persona("Juan"));
		personas.add(new Persona("María", "Pérez"));
		personas.add(new Persona("José", "García", 33));
		personas.add(new A());
		
		Persona p = new Persona();
		p.setNombre("Erica");
		p.setApellido("Barrios");
		p.setEdad(44);
		
		personas.add(p);
		
		for (Object obj : personas) {
			if (obj instanceof Persona)
				((Persona)obj).imprimir();
		}
	}
}

class A {}