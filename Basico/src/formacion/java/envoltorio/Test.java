package formacion.java.envoltorio;

public class Test {
	public static void main(String[] args) {
		// AUTOBOXING
		Integer i1 = 4; // autoboxing
		Integer i2 = new Integer(4); // Clase wrapper
		
		if (i1 == i2)
			System.out.println("Son idénticos"); // son el mismo objeto (apuntan a la misma dirección de memoria)
		else if (i1.equals(i2))
			System.out.println("Son iguales");
		else
			System.out.println("No son idénticos");
		
		
		// AUTOUNBOXING
		int i3 = i1; // Autounboxing
		int i4 = i2.intValue(); 
		
		if (i3 == i4)
			System.out.println("Son iguales");
		else
			System.out.println("Son diferentes");
	}
}
