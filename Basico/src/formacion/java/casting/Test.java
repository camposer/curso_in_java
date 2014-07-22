package formacion.java.casting;

public class Test {
	public static void main(String[] args) {
		int a = 2;
		long b = a;
		
		a = (int)b;
		
		float c = 2.8000000000000009999f;
		double d = c;
		
		c = (float)d;
		a = (int)c;
		
		System.out.println(c); // => 2.8
		System.out.println(d); // => 2.8
		System.out.println(a); // => 2
		
	}
}
