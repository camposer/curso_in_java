package formacion.java.array;

public class Test {
	public static void main(String[] args) {
		// Declaraciones
		int w = 1, z = 2;
		char[] a, b;
		char c[], d;
		
		// Arrays unidimensionales
		int[] numeros = new int[5];
		imprimir(numeros);
		
		String[] nombres = new String[5];
		imprimir(nombres);
		
		numeros[0] = 1;
		numeros[1] = 2;
		numeros[2] = 3;
		numeros[3] = 4;
		numeros[4] = 5;
		imprimir(numeros);
		
		for (int i = 0; i < nombres.length; i++) {
			nombres[i] = (i + 1) + "";
		}
		imprimir(nombres);
		
		// Arrays multidimensionales
		int[][] multi = new int[3][];
		int valor = 0; 
		for (int i = 0; i < multi.length; i++) {
			multi[i] = new int[3];
			
			for (int j = 0; j < multi[i].length; j++) {
				multi[i][j] = valor; 
			}
			
			valor++;
		}
		imprimir(multi);
		
	}

	private static void imprimir(int[][] multi) {
		/*
		for (int i = 0; i < multi.length; i++) {
			for (int j = 0; j < multi[i].length; j++) {
				System.out.print(multi[i][j] + ", ");
			}
		}
		System.out.println();
		*/
		for (int[] fila : multi) {
			for (int celda : fila) {
				System.out.print(celda + ", ");
			}
		}
		System.out.println();
	}

	private static void imprimir(int[] numeros) {
		for (int i = 0; i < numeros.length; i++) 
			System.out.print(numeros[i] + ", ");
		System.out.println();
	}

	private static void imprimir(String[] nombres) {
		/*
		for (int i = 0; i < nombres.length; i++) 
			System.out.print(nombres[i] + ", ");
		*/
		for (String n : nombres)
			System.out.print(n + ", ");
		System.out.println();
	}

}
