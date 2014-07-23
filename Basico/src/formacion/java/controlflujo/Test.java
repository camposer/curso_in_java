package formacion.java.controlflujo;

public class Test {
	public static void main(String[] args) {
		ejecutarIf(); // IF
		ejecutarSwitch(); // SWITCH
		ejecutarFor(); // FOR
		ejecutarWhile(); // WHILE
	}

	private static void ejecutarWhile() {
		int i; // Declaración
		i= 0; // Definición
		while (i < 10) {
			System.out.println("i = " + i);
			i++;
		}
		
		i = 0;
		while (true) {
			i++;
			if (i > 5 && i != 10)
				continue;
			else if (i == 10)
				break;

			System.out.println("i = " + i);
		}
		
		i = 0;
		do {
			System.out.println("i = " + i);
			i++;
		} while(i < 10);
	}

	private static void ejecutarFor() {
		for (int i = 0; i < 10; i++)
			System.out.println("i = " + i);
		
		System.out.println();
		for (int i = 0; i < 10;) {
			System.out.println("i = " + i++);
		}
		
		System.out.println();
		for (int i = 0;;) {
			System.out.println("i = " + i++);
			if (i == 10)
				break;
		}

		int i = 0;
		for (;;) {
			System.out.println("i = " + i++);
			if (i == 10)
				break;
		}
	}
	
	

	private static void ejecutarSwitch() {
		String opcion = "PRIMERO";

		switch (opcion) {
			case "PRIMERO":
				System.out.println("Es 1");
			case "SEGUNDO":
				System.out.println("Es 2");
				break;
			case "TERCERO":
				System.out.println("Es 3");
			default:
				System.out.println("No es 1 ni 2 ni 3");
		}
		
		if (opcion.equals("PRIMERO") || opcion.equals("SEGUNDO"))
			System.out.println("Es 1 ó 2");
	}

	public static void ejecutarIf() {
		int a = 1;
		int b = 2;

		// 1.
		if (a == b) {
			System.out.println("A es igual a B");
			System.out.println("A - B = " + (a - b));
		} else if (a > b) {
			System.out.println("A es mayor que B");
		} else {
			System.out.println("A es diferente de B");
		}

		// 2.
		if (a != b)
			System.out.println("A es diferente de B");

		// 3.
		// String sonIguales = (a == b)?"Son iguales":"Son diferentes";
		System.out.println((a == b) ? "Son iguales" : "Son diferentes");
	}
}
