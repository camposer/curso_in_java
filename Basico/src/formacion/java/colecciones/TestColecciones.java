package formacion.java.colecciones;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestColecciones {
	public static void main(String[] args) {
		//pruebaSet();
		pruebaList();
	}

	private static void pruebaList() {
		List elementos = dameElementosList();
		
		System.out.println(elementos); // => 1, uno, [a = 1], [a = 1]
		
		// 1. FOR-EACH
		for (Object obj : elementos) 
			System.out.println(obj);
		
		// 2. Iterator
		Iterator iter = elementos.iterator();
		while (iter.hasNext()) 
			System.out.println(iter.next());

		// 3. FOR
		for (int i = 0; i < elementos.size(); i++) 
			System.out.println(elementos.get(i));
	}

	private static List dameElementosList() {
		List elementos = new ArrayList();
		elementos.add(1);
		elementos.add(1);
		elementos.add("uno");
		elementos.add("uno");
		elementos.add(new A(1));
		elementos.add(new A(1));
		
		return elementos;
	}

	private static void pruebaSet() {
		Set elementos = dameElementosSet();
		
		System.out.println(elementos); // => 1, uno, [a = 1], [a = 1]
		
		// 1. FOR-EACH
		for (Object obj : elementos) 
			System.out.println(obj);
		
		// 2. Iterator
		Iterator iter = elementos.iterator();
		while (iter.hasNext()) 
			System.out.println(iter.next());
	}
	
	private static Set dameElementosSet() {
		Set elementos = new HashSet();
		elementos.add(1);
		elementos.add(1);
		elementos.add("uno");
		elementos.add("uno");
		elementos.add(new A(1));
		elementos.add(new A(1));
		
		return elementos;
	}
}

class A {
	public int a;
	public int b;
	public String nombre = "";
	public A(int a) {
		this.a = a;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
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
		A other = (A) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "A [a=" + a + "]";
	}
}