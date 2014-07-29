package formacion.java.entradasalida;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class TestSerializacion {
	public static void main(String[] args) throws Exception {
		C c1 = new C(1, 2);
		serializar(c1, "archivos/c1.byte");
		System.out.println("Objeto serializado... " + c1);
		C c2 = (C)deserializar("archivos/c1.byte");
		System.out.println("Objeto deserializado... " + c2);
	}

	private static void crearCarpeta(String carpetaPadre, 
			String carpetaHijo) throws Exception {
		File carpeta = new File(new File(carpetaPadre), 
				carpetaHijo);
		carpeta.mkdir();
	}
	
	private static Object deserializar(String archivo) {
		Object retorno = null;
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(archivo);
			ObjectInputStream ois = new ObjectInputStream(fis);
			retorno = ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fis != null)
					fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		return retorno;
	}

	public static void serializar(Object obj, String archivo) throws Exception {
		FileOutputStream fos = new FileOutputStream(archivo);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj); // Serializando el objeto
		fos.close();
	}

}

class C implements Serializable {
	private static final long serialVersionUID = -7793357390411864438L;

	public int a;
	public int b;
	public C(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "C [a=" + a + ", b=" + b + "]";
	}
}
