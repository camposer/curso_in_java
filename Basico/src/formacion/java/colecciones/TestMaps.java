package formacion.java.colecciones;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMaps {
	public static void main(String[] args) {
		//sinGenericos();
		conGenericos();
	}

	private static void conGenericos() {
		Map<Integer, B> personas = new HashMap<Integer, B>();
		personas.put(1, new B(1));
		personas.put(2, new B(2));
		personas.put(3, new B(3));
		personas.put(new Integer(4), new B(4));
		personas.put(new Integer(4), new B(66));
		
		for (Integer c : personas.keySet()) {
			B valor = personas.get(c);
			System.out.println(c + " = " + valor);
		}
	}

	private static void sinGenericos() {
		Date fecha = new Date();
		
		Map mapa = new HashMap();
		mapa.put("uno", "uno");
		mapa.put(2, "dos");
		mapa.put(2, 2); // Reemplaza el de arriba
		mapa.put(fecha, 3);
		mapa.put("cuatro", new B(1));
		mapa.put(new B(2), "hola");
		mapa.put(new B(2), "adiós");
		
		// Imprimiendo todos los valores dada la clave correspondiente
		System.out.println("uno = " + mapa.get("uno"));
		System.out.println("2 = " + mapa.get(2));
		System.out.println(fecha + " = " + mapa.get(fecha));
		System.out.println("cuatro = " + mapa.get("cuatro"));
		System.out.println(new B(2) + " = " + mapa.get(new B(2)));
		System.out.println();
		
		
		Set claves = mapa.keySet();
		for (Object c : claves) {
			Object valor = mapa.get(c);
			if (valor instanceof B) 
				System.out.print("El valor es una instancia de B... ");
			
			System.out.println(c + " = " + valor);
		}
	}
}

class B {
	private int b;
	public B(int b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "B [b=" + b + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + b;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		B other = (B) obj;
		if (b != other.b)
			return false;
		return true;
	}
	
}
