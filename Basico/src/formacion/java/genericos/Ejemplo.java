package formacion.java.genericos;

public class Ejemplo {
	public static void main(String[] args) {
		System.out.println(new A(new Dato("hola")).imprimir());
		System.out.println(new B("hola").imprimir());
		
		// Utilizando genéricos
		System.out.println(new Generica<Dato>(new Dato("hola")).imprimir());
		System.out.println(new Generica<String>("hola").imprimir());
	}
}

class Generica<T> {
	private T valor;
	public Generica(T valor) {
		this.valor = valor;
	}
	public String imprimir() {
		return valor.toString();
	}
}

class A {
	private Dato valor;
	public A(Dato valor) {
		this.valor = valor;
	}
	public String imprimir() {
		return valor.toString();
	}
}

class B {
	private String valor;
	public B(String valor) {
		this.valor  = valor;
	}
	public String imprimir() {
		return valor.toString();
	}
}

class Dato {
	private String dato;
	public Dato(String dato) {
		this.dato = dato;
	}
	public String toString() {
		return "Dato [dato=" + dato + "]";
	}
}