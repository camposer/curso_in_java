package formacion.java.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestOrdenacionList {
	public static void main(String[] args) {
		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
		estudiantes.add(new Estudiante("Juan", 9f, 1, 2009));
		estudiantes.add(new Estudiante("María", 2f, 3, 2013));
		estudiantes.add(new Estudiante("Pedro", 4f, 6, 2007));
		estudiantes.add(new Estudiante("José", 1f, 5, 2010));

		Collections.sort(estudiantes,
				new EstudiantesPorCalificacionComparator());
		System.out.println(estudiantes);
		System.out.println();

		List<Estudiante> estudiantesCopy = 
				new ArrayList<Estudiante>();
		Collections.copy(estudiantesCopy, estudiantes);
		Collections.sort(estudiantesCopy, 
				new EstudiantesPorAnioComparator());
		System.out.println(estudiantesCopy);
		System.out.println();
		
		// Utilizando clase anónima
		Comparator<Estudiante> anonima = 
				new Comparator<Estudiante>() {

			@Override
			public int compare(Estudiante e1, Estudiante e2) {
				return e1.curso - e2.curso;
			}
		};
		
		Collections.sort(estudiantes, 
				anonima);
		System.out.println(estudiantes);
		System.out.println();
	}
}

class EstudiantesPorCalificacionComparator implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante e1, Estudiante e2) {
		if (e1.calificacion > e2.calificacion)
			return 1;
		else if (e1.calificacion == e2.calificacion)
			return 0;
		else
			return -1;
	}

}

class EstudiantesPorAnioComparator implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante e1, Estudiante e2) {
		return e1.anioIngreso - e2.anioIngreso;
	}

}
