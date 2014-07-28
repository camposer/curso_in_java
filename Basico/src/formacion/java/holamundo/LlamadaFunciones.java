package formacion.java.holamundo;

public class LlamadaFunciones {
	public static void main(String[] args) {
		int i = 1;
		sumar(i);
		System.out.println(i); // => 1
		
		A a = new A(1);
		sumar(a);
		System.out.println(a); // => 2
	}
	
	public static void sumar(int i) {
		i++;
	}
	
	public static void sumar(A a) {
		a.a++;
	}
}

class A {
	public int a;
	public A(int a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return a + "";
	}
}
