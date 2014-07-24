package uno;
public class Persona extends SerVivo {
	private String nombre;
	private String apellido = "García";
	private int edad;

	@Override
	public void respirar() {
		System.out.println("Estoy respirando como Persona");
	}
	@Override
	public void comer() {
		System.out.println("Estoy comiendo como Persona");
	}
	public void comer(int cantidad) {
		System.out.println("Estoy comiendo como Persona esta cantidad: " + cantidad);
	}
	public void caminar() {
		System.out.println("Estoy caminando como Persona");
	}
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
	public void imprimir() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Edad: " + edad);
		System.out.println();
	}
}