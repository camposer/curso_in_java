
public class Persona 
		implements java.io.Serializable {

	private static final long serialVersionUID = 316515004956642187L;
	private String nombre;
	private String apellido = "García";
	private int edad;

	public Persona() { }
	public Persona(String nombre) {
		//this(nombre, "", 0);
		this.nombre = nombre;
		this.edad = 0;
	}
	public Persona(String nombre, String apellido) {
		this(nombre, apellido, 0);
	}
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + "]";
	}
}