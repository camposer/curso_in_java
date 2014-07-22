package formacion.java.test;

import formacion.java.holamundo.Salutacion;

public class TestGreeting {
	public static void main(String[] args) {
		Salutacion hola = new Salutacion();
		hola.saludo(); // => Hola!
		hola.saludo("María"); // => Hola María 
	}
}