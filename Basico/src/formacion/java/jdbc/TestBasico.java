package formacion.java.jdbc;

import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestBasico {
	public static final String URL = "jdbc:derby://localhost/test";
	public static final String USUARIO = "user";
	public static final String CLAVE = "123";
	
	public static void main(String[] args) throws Exception {
		// 1. Cargar el driver
		Class.forName("org.apache.derby.jdbc.ClientDriver"); // Crea una instancia de la clase especificada
		
		// 2. Obtener la conexión
		Connection conn = DriverManager.getConnection(URL, 
				USUARIO, CLAVE);
		
		// 3. Crear el comando/sentencia
		Statement stmt = conn.createStatement();
		
		// 4. Ejecutar comando/sentencia (INSERT, UPDATE, DELETE, SELECT)
		stmt.execute("INSERT INTO persona" +
				"(nombre, apellido, altura, fechaNacimiento) " +
				"VALUES ('José', 'Campos', 1.82, '2002-02-02')");

		// 4.1 Procesar los resultados (sólo SELECT)
		ResultSet rs = stmt.executeQuery("SELECT * FROM persona");
		while (rs.next()) {
			System.out.println("Id: " + rs.getInt(1)); // Índice del campo o nombre
			System.out.println("Nombre: " + rs.getString("nombre"));
			System.out.println("Apellido: " + rs.getString("apellido"));
			System.out.println("Altura: " + rs.getFloat("altura"));
			System.out.println("Fnac: " + rs.getDate("fechaNacimiento"));
			System.out.println();
		}
		
		// 5. Liberar
		conn.close();
		
	}
}
