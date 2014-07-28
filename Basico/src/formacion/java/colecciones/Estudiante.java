package formacion.java.colecciones;

public class Estudiante implements Comparable<Estudiante> {
	public String nombre;
	public Float calificacion;
	public Integer curso;
	public Integer anioIngreso;
	
	public Estudiante(String nombre, Float calificacion, Integer curso,
			Integer anioIngreso) {
		super();
		this.nombre = nombre;
		this.calificacion = calificacion;
		this.curso = curso;
		this.anioIngreso = anioIngreso;
	}

	@Override
	public int compareTo(Estudiante o) {
		if (this.calificacion > o.calificacion)
			return 1;
		else if  (this.calificacion == o.calificacion)
			return 0;
		else
			return -1;
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", calificacion="
				+ calificacion + ", curso=" + curso + ", anioIngreso="
				+ anioIngreso + "]";
	}
	
	
}

