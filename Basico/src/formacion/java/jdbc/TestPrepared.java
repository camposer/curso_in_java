package formacion.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class TestPrepared {
	public static final String URL = "jdbc:derby://localhost/test";
	public static final String USUARIO = "user";
	public static final String CLAVE = "123";
	
	public static void main(String[] args) throws Exception {
		Class.forName("org.apache.derby.jdbc.ClientDriver"); // Crea una instancia de la clase especificada
		
		Connection conn = DriverManager.getConnection(URL, 
				USUARIO, CLAVE);

		// Agregando una persona
		java.sql.Date fecha = 
				new java.sql.Date(new java.util.Date().getTime());
		String sql = "INSERT INTO persona(nombre, apellido, altura, fechaNacimiento) " +
				"VALUES(?, ?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, "Juan");
		pstmt.setString(2, "González");
		pstmt.setFloat(3, 30.5f);
		pstmt.setDate(4, fecha);
		pstmt.execute(); // ejecuto la query de insert
		
		// Consultando todas las personas
		sql = "SELECT * FROM persona";
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery(); // ejecuto la query de select 
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
