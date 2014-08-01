package formacion.java.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;


/**
 * Por cada clase hago una clase de prueba
 * Este este caso, esta clase probaría todo lo 
 * relacionado a HolaMundo
 */
public class HolaMundoTest {
	/**
	 * Este método representa un caso de prueba
	 * relacionado con la clase HolaMundo
	 */
	@Test
	public void test1() {
		int a = 2;
		assertEquals(2, a); // => true
	}
		
	@Test
	public void test2() {
		HolaMundo hm = null;
		assertNotNull(hm); // => false
	}
	
	@Test
	public void saludar() {
		HolaMundo hm = new HolaMundo();
		assertEquals("Hola Juan", hm.saludar("Juan"));
	}
	
	@Test(expected=SustreandoInvalidoException.class)
	public void c3p0() throws SustreandoInvalidoException {
		float a = new Calculadora().restar(1, 2);
	}
}

class HolaMundo {
	public String saludar(String nombre) {
		return "Hola " + nombre;
	}
}

class SustreandoInvalidoException extends Exception {}

class Calculadora {
	public float sumar(float a, float b) { return a + b; }
	public float restar(float a, float b) throws SustreandoInvalidoException {
		if (b > a)
			throw new SustreandoInvalidoException();
		return a - b; 
	}
	public float multiplicar(float a, float b) { return a * b; }
	public float dividir(float a, float b) { return a / b; }
}


