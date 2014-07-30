package version1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class PersonaCrud {
	private static final String URL = "jdbc:derby://localhost/test";
	private static final String USUARIO = "user";
	private static final String CLAVE = "123";
	
	private Scanner scanner;
	private Connection con;
	
	static { // Región estática (ejecutado antes del main). Cargado por el ClassLoader
		try {
			Class.forName("org.apache.derby.jdbc.ClientDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public PersonaCrud() {
		this.scanner = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		new PersonaCrud().iniciar();
	}
	
	public void iniciar() {
		while (true) {
			System.out.println("\nPersona");
			System.out.println("1. Agregar");
			System.out.println("2. Consultar todos");
			System.out.println("3. Salir");
			System.out.println("?");
			
			String opcion = scanner.nextLine();
			if (opcion.equals("1"))
				agregarPersona();
			else if (opcion.equals("2"))
				obtenerPersonas();
			else if (opcion.equals("3"))
				break;
		}
	}

	private void obtenerPersonas() {
		try {
			abrirConexion();
		} catch (SQLException e) {
			System.out.println("Error al abrir la conexión con la BD");
			e.printStackTrace();
			return; // Sale del método si devuelve la excepción
		}
		
		try {
			String sql = "SELECT * FROM persona";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.println();
				System.out.println("Id: " + rs.getInt("id"));
				System.out.println("Nombre: " + rs.getString("nombre"));
				System.out.println("Apellido: " + rs.getString("apellido"));
				System.out.println("Altura: " + rs.getFloat("altura"));
				System.out.println("Fnac: " + rs.getDate("fechaNacimiento"));
			}
		} catch (SQLException e1) {
			System.out.println("Ha ocurrido un error al consultar las personas, SQLCODE: " + e1.getErrorCode());
			e1.printStackTrace();
		}
		
		try {
			cerrarConexion();
		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexión con la BD");
			e.printStackTrace();
		}
	}

	private void agregarPersona() {
		System.out.print("Nombre? ");
		String nombre = scanner.nextLine();
		System.out.print("Apellido? ");
		String apellido = scanner.nextLine();
		System.out.print("Altura? ");
		String altura = scanner.nextLine();
		
		try {
			abrirConexion();
		} catch (SQLException e) {
			System.out.println("Error al abrir la conexión con la BD");
			e.printStackTrace();
			return; // Sale del método si devuelve la excepción
		}
		
		try {
			String sql = "INSERT INTO persona(nombre, apellido, altura) " +
					"VALUES('" + nombre + "', '" + apellido + "', " + altura + ")";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(sql);
		} catch (SQLException e1) {
			System.out.println("Ha ocurrido un error al insertar la persona, SQLCODE: " + e1.getErrorCode());
			e1.printStackTrace();
		}
		
		try {
			cerrarConexion();
		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexión con la BD");
			e.printStackTrace();
		}
	}

	private void cerrarConexion() throws SQLException {
		if (con != null)
			con.close();
	}

	private void abrirConexion() throws SQLException {
		con = DriverManager.getConnection(URL, USUARIO, CLAVE);
	}
}
