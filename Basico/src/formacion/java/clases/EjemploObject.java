package formacion.java.clases;

public class EjemploObject {
	public static void main(String[] args) {
		ejecutar(new Animal());
		ejecutar(new Mamifero());
		ejecutar(new Oviparo());
	}

	private static void ejecutar(Object animal) {
		if (animal instanceof Mamifero) {
			((Mamifero)animal).mamar();
		} else if (animal instanceof Oviparo) {
			((Oviparo)animal).picar();
		} else if (animal instanceof Animal) {
			((Animal)animal).comer();
			((Animal)animal).respirar();
		}
			
	}
}

class Animal {
	public void respirar() {
		System.out.println("Estoy respirando...");
	}
	public void comer() {
		System.out.println("Estoy comiendo...");
	}
}

class Mamifero extends Animal {
	public void mamar() {
		System.out.println("Estoy mamando...");
	}
}

class Oviparo extends Animal {
	public void picar() {
		System.out.println("Estoy picando código...");
	}
}


