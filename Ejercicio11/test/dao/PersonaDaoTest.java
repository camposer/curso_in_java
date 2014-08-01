package dao;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import model.Persona;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PersonaDaoTest {
	private PersonaDao pdao;
	
	@Before
	public void inicializar() {
		this.pdao = new PersonaDao();
	}
	
	@Test
	public void obtenerTodos() {
		List<Persona> personas = pdao.obtenerTodos();
		if (personas != null) {
			assertTrue(personas.size() > 0);
			
			for (Persona p : personas) {
				assertTrue(p.getId() != null); // not null
				assertTrue(p.getNombre() != null); // not null
				assertTrue(p.getApellido() != null); // not null
			}
		}
	}
	
	@Test
	public void agregar() throws ParseException {
		Persona p = new Persona("Prueba", 
				"Prueba", 
				1.80f, 
				new SimpleDateFormat("yyyy-MM-dd")
					.parse("1980-01-01")
			);
		
		List<Persona> personasAntes = pdao.obtenerTodos();
		int numPersonaAntes = 
				(personasAntes != null)?personasAntes.size():0;
		
		pdao.agregar(p);
		
		List<Persona> personasDespues = pdao.obtenerTodos(); 
		int numPersonasDespues = personasDespues.size();
		
		assertTrue(numPersonasDespues > numPersonaAntes);
		
		Persona pNueva = 
				personasDespues.get(personasDespues.size() - 1);
		
//		assertTrue(p.getId().equals(pNueva.getId()));
		assertTrue(p.getNombre().equals(pNueva.getNombre()));
		assertTrue(p.getApellido().equals(pNueva.getApellido()));
		assertTrue(p.getAltura().equals(pNueva.getAltura()));
		assertTrue(p.getFechaNacimiento().equals(pNueva.getFechaNacimiento()));
		
		pdao.eliminar(pNueva.getId()); // TODO Esto deberíamos quitarlo y utilizar rollback (añadir capa de Transacciones)
	}
	
	@After
	public void after() {
		// TODO Añadir rollback en método after cuando se tenga capa para el manejo de transacciones
	}
}
