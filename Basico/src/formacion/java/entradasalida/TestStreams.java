package formacion.java.entradasalida;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class TestStreams {
	public static void main(String[] args) throws Exception {
		//leerFicherSoloBytes();
		//leerFicherSoloLineas();
		//leerConsola1(); // Este método no es recomendable!
		//leerConsola2();
		//leerConsola3(); // RECOMENDADA!
	}

	private static void leerConsola3() throws Exception {
		Scanner scanner = new Scanner(System.in);
		
		String linea = scanner.nextLine();
		System.out.println(linea);
	}

	private static void leerConsola2() throws Exception {
		InputStream is = System.in; // bytes
		Reader r = new InputStreamReader(is); // chars
		BufferedReader br = new BufferedReader(r); // lines
		
		String linea = br.readLine();
		System.out.println(linea);
	}

	private static void leerConsola1() throws Exception {
		InputStream is = System.in;
		String linea = new DataInputStream(is).readLine(); // Obsoleto
		System.out.println(linea);
	}

	private static void leerFicherSoloBytes() throws Exception {
		// 1. Abrir fichero
		FileInputStream fis = 
				new FileInputStream("archivos/hola.txt");
		
		// Recorriendo el fichero hasta el final (byte a byte)
		int b = fis.read(); // Dame el primer byte
		while (b != -1) {
			System.out.print((char)b);
			b = fis.read(); // Dame el siguiente byte
		}

		// Cerrando el fichero
		fis.close();
	}

	private static void leerFicherSoloLineas() throws Exception {
		// 1. Abrir fichero
		FileInputStream fis = 
				new FileInputStream("archivos/hola.txt");
		
		// 2. Envolviendo para poder leer líneas no bytes
		DataInputStream dis = 
				new DataInputStream(fis); 
				
		// 3. Recorriendo el fichero línea a línea
		String linea = dis.readLine(); // método obsoleto!
		while (linea != null) {
			System.out.print(linea);
			linea = dis.readLine();
		}

		fis.close();
	}
	
	
}
