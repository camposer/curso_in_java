
public class FooBarBaz {

	public static void main(String[] args) {
		String[][] matriz = new String[5*3*7][3];
		
		// Llenando la matriz
		for (int i = 1; i <= matriz.length; i++) {
			if (i % 3 == 0)
				matriz[i - 1][0]  = "foo";
			if (i % 5 == 0)
				matriz[i - 1][1]  = "bar";
			if (i % 7 == 0)
				matriz[i - 1][2]  = "baz";
		}
		
		// Imprimir la matriz
		for (int i = 0; i < matriz.length; i++) {
			String texto = (i + 1) + ". ";
			if (matriz[i][0] != null)
				texto += matriz[i][0] + " ";
			if (matriz[i][1] != null)
				texto += matriz[i][1] + " ";
			if (matriz[i][2] != null)
				texto += matriz[i][2] + " ";
			
			System.out.println(texto);
		}
	}

}
