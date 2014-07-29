import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Serializador {
	public static final String NOMBRE_ARCHIVO = "archivos/Personas.byte";
	
	private Scanner scanner;
	
	public Serializador() {
		this.scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) throws Exception {
		new Serializador().iniciar();
	}
	
	public void iniciar() throws Exception {
		List<Persona> personas =
				new ArrayList<Persona>();
		boolean sigo = true;
		while (sigo) {
			System.out.println();
			System.out.println("Nombre?");
			String nombre = scanner.nextLine();
			System.out.println("Apellido?");
			String apellido = scanner.nextLine();
			System.out.println("Edad?");
			String sedad = scanner.nextLine();
			int edad = Integer.parseInt(sedad);
			
			personas.add(new Persona(nombre, apellido, edad));
			
			System.out.println("Desea continuar (S/N)?");
			String opcion = scanner.nextLine();
			if (opcion.equalsIgnoreCase("N"))
				sigo = false;
		}
		
		// Construyendo y serializando el objeto (Persona)
		serializar(personas, NOMBRE_ARCHIVO);
		System.out.println("Objeto serializado... " + personas);
		
		personas = (List<Persona>)deserializar(NOMBRE_ARCHIVO);
		System.out.println("Objeto deserializado... " + personas);
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
