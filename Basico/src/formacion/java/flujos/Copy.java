package formacion.java.flujos;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copy {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = 
				new FileInputStream("archivos/java-duke-cofee.jpg");
		FileOutputStream fos = 
				new FileOutputStream("archivos/java-duke-cofee-copy.jpg");
		
		// Leyendo del archivo origen y escribiendo en destino
		for (int b = fis.read(); b != -1; b = fis.read()) 
			fos.write(b);
		
		fos.flush(); // Liberando bytes escritos
		
		// Cerrando ficheros
		fos.close();
		fis.close();
		
		System.out.println("Archivo copiado");
	}
}
