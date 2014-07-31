package formacion.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestTransacciones {
	public static final String URL = "jdbc:derby://localhost/test";
	public static final String USUARIO = "user";
	public static final String CLAVE = "123";

	static {
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, 
					USUARIO, CLAVE);

			// BEGIN
			conn.setAutoCommit(false); // Activa el uso de transacciones explícitamente
			
			// Agregando una persona (satisfactorio!)
			java.sql.Date fecha = 
					new java.sql.Date(new java.util.Date().getTime());
			String sql = "INSERT INTO persona(nombre, apellido, altura, fechaNacimiento) " +
					"VALUES(?, ?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Prepared");
			pstmt.setString(2, "González");
			pstmt.setFloat(3, 30.5f);
			pstmt.setDate(4, fecha);
			pstmt.execute(); // ejecuto la query de insert
			
			// Agregando una persona (falla!)
			sql = "INSERT INTO persona(nombre, apellido, altura, fechaNacimiento) " +
					"VALUES(?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "Juan");
			pstmt.setString(2, "González");
			pstmt.setFloat(3, 30.5f);
			pstmt.setDate(4, fecha);
			
			pstmt.execute(); // ejecuto la query de insert
			
			conn.commit(); // COMMIT
			System.out.println("Transacción comprometida");
		} catch (Exception e) {
			e.printStackTrace();

			if (conn != null)
				try {
					conn.rollback();
					System.out.println("Transacción deshecha");
				} catch (SQLException e1) {
					System.err.println("No se pudo hacer rollback");
					e1.printStackTrace();
				}
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				System.err.println("No se pudo cerrar la conexión");
				e.printStackTrace();
			}
			
		}
	}
}
