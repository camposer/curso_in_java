package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.Persona;
import exception.AppDaoException;

public class PersonaDao extends BaseDao {
	public PersonaDao() {
		super();
	}

	public List<Persona> obtenerTodos() {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		String sql = "SELECT * FROM persona";
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs  = stmt.executeQuery(sql);
			
			while (rs.next()) {
				Persona p = new Persona(
							rs.getString("nombre"),
							rs.getString("apellido")
						);
				p.setAltura(rs.getFloat("altura"));
				p.setFechaNacimiento(rs.getDate("fechaNacimiento"));
				p.setId(rs.getInt("id"));
				
				listaPersonas.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AppDaoException(e);
		}
		
		return listaPersonas;
	}

	public void agregar(Persona p) {
		String fecha = new SimpleDateFormat("yyyy-MM-dd")
			.format(p.getFechaNacimiento());
		
		String sql = "INSERT INTO persona(nombre, apellido, altura, fechaNacimiento) " +
				"VALUES('" + p.getNombre() + "', " + 
				"'" + p.getApellido() + "'," + 
				p.getAltura() + ", " +
				"'" + fecha + "')";
		
		Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.execute(sql);
		} catch (SQLException e) {
			e.printStackTrace();
			throw new AppDaoException(e);
		}
	}
}
