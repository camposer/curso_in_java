package formacion.java.operadores;

public class Test {
	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		int c = 3;
		
		int d = ++a + b - --c * b;
		//int d = (a + 1 + b) - (c - 1) * b;
		//int d = ++a + b - --c * c; // => 4
		System.out.println("d = " + d); // => 2
	}
}
