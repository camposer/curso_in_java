package formacion.java.estatico;

public class TestContador {
	public static int contador = 0;
	public int indice = 0;
	
	public TestContador() {
		contador++;
		indice++;
	}
	
	public void imprimir() {
		System.out.println("this.indice = " + 
				this.indice); 
		System.out.println("TestContador.contador = " + 
				contador);  
	}
	
	public static void imprimirEstatico(TestContador tc) {
		System.out.println("this.indice = " + 
				tc.indice); 
		System.out.println("TestContador.contador = " + 
				contador); // => 3 
	}
	
	public static void main(String[] args) {
		new TestContador();
		TestContador tc2 = new TestContador();
		TestContador tc3 = new TestContador();

		System.out.println("tc2.indice = " + 
				tc2.indice); // => 1
		System.out.println("tc2.contador = " + 
				tc2.contador); // => 3 

		System.out.println("tc3.indice = " + 
				tc3.indice); // => 1  
		System.out.println("tc3.contador = " + 
				tc3.contador); // => 3

		System.out.println("TestContador.contador = " + 
				TestContador.contador); // => 3 
	}
}
