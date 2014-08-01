package test;

import logica.Calculadora;
import static org.junit.Assert.*;

import org.junit.Test;

import exception.EnteroDesbordadoException;
import exception.MenorQueCeroException;

public class CalculadoraTest {
	@Test
	public void sumarCorrecto() throws EnteroDesbordadoException, MenorQueCeroException {
		assertEquals(5, Calculadora.sumar(2, 3));
		assertEquals(8, Calculadora.sumar(4, 4));
	}
	@Test(expected=MenorQueCeroException.class)
	public void sumarOp1MenorQueCero() throws EnteroDesbordadoException, MenorQueCeroException {
		Calculadora.sumar(-9000, 2);
	}
	@Test(expected=MenorQueCeroException.class)
	public void sumarOp2MenorQueCero() throws EnteroDesbordadoException, MenorQueCeroException {
		Calculadora.sumar(1, -2);
	}
	@Test(expected=EnteroDesbordadoException.class)
	public void sumarResultadoMayorQueInt() throws EnteroDesbordadoException, MenorQueCeroException {
		int a = Calculadora.sumar(Integer.MAX_VALUE, 1);
		System.out.println(a);
	}
	
	
	
}
