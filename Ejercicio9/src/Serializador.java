import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Serializador {
	public static final String NOMBRE_ARCHIVO = "archivos/Persona.byte";
	
	private Scanner scanner;
	
	public Serializador() {
		this.scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) throws Exception {
		new Serializador().iniciar();
	}
	
	public void iniciar() throws Exception {
		System.out.println("Nombre?");
		String nombre = scanner.nextLine();
		System.out.println("Apellido?");
		String apellido = scanner.nextLine();
		System.out.println("Edad?");
		String sedad = scanner.nextLine();
		int edad = Integer.parseInt(sedad);
		
		// Construyendo y serializando el objeto (Persona)
		Persona p = new Persona(nombre, apellido, edad);
		serializar(p, NOMBRE_ARCHIVO);
		System.out.println("Objeto serializado... " + p);
		
		p = (Persona)deserializar(NOMBRE_ARCHIVO);
		System.out.println("Objeto deserializado... " + p);
	}
	
	public void serializar(Object obj, String archivo) throws Exception {
		FileOutputStream fos = 
				new FileOutputStream(archivo);
		ObjectOutputStream oos =
				new ObjectOutputStream(fos);
		oos.writeObject(obj);
		fos.close();
	}
	
	public Object deserializar(String archivo) throws Exception {
		FileInputStream fis = 
				new FileInputStream(archivo);
		ObjectInputStream ois = 
				new ObjectInputStream(fis);
		Object obj = ois.readObject();
		ois.close();
		return obj;
	}
}
