package formacion.java.colecciones;

import java.util.Set;
import java.util.TreeSet;

public class TestOrdenacionSet {
	public static void main(String[] args) {
		Set<Estudiante> estudiantes = new TreeSet<Estudiante>();
		estudiantes.add(new Estudiante("Juan", 9f, 1, 2009));
		estudiantes.add(new Estudiante("María", 2f, 3, 2013));
		estudiantes.add(new Estudiante("Pedro", 4f, 6, 2007));
		estudiantes.add(new Estudiante("José", 1f, 5, 2010));
		
		for (Estudiante e : estudiantes) {
			System.out.println(e);			
		}
	}
}