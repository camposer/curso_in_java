package formacion.java.entradasalida;

import java.io.BufferedReader;
import java.io.FileReader;

public class TestCharacters {
	public static void main(String[] args) throws Exception {
		leerFicheroSoloCharacteres();
	}

	private static void leerFicheroSoloCharacteres() throws Exception {
		BufferedReader br = 
				new BufferedReader(
						new FileReader("archivos/hola.txt"));

		String linea = br.readLine();
		while (linea != null) {
			System.out.println(linea);
			linea = br.readLine();
		}
		
	}
}
