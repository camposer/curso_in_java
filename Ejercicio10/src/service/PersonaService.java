package service;

import java.util.List;

import dao.PersonaDao;
import exception.AppDaoException;
import exception.AppServiceException;
import model.Persona;

public class PersonaService {

	public List<Persona> obtenerPersonas() {
		try {
			return new PersonaDao().obtenerTodos();
		} catch (AppDaoException e) {
			throw new AppServiceException(e);
		}
	}

	public void agregarPersona(Persona p) {
		try {
			new PersonaDao().agregar(p);
		} catch (AppDaoException e) {
			throw new AppServiceException(e);
		}
	}
	
}
