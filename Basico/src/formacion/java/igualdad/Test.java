package formacion.java.igualdad;

public class Test {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		
		if (a == b) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales");
		}
		
		Clase c1 = new Clase(1, 2, 3);
		Clase c2 = new Clase(1, 2, 3);
		Clase c3 = c2;

		if (c1 == c2) {
			System.out.println("Son idénticos");
		} else if (c1.a == c2.a && c1.b == c2.b && c1.c == c2.c) { 
			System.out.println("Son iguales");
		} else {
			System.out.println("No son iguales ni idénticos");
		}

		System.out.println("C2 = " + c2);
		
		String hola1 = new String("hola");
		String hola2 = new String("hola");

		if (hola1 == hola2) {
			System.out.println("Son idénticos");
		} else if (hola1.equals(hola2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("No son idénticos");
		}
		
		System.out.println("hola1 = " + hola1);
		
	}
}

class Clase {
	public int a;
	public int b;
	public int c;
	
	public Clase(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public String toString() {
		return "Clase [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
}


