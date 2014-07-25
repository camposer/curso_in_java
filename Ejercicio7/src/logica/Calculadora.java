package logica;

import exception.DivisionNoExactaException;
import exception.DivisorCeroException;
import exception.EnteroDesbordadoException;
import exception.MenorQueCeroException;
import exception.SustraendoInvalidoException;

public abstract class Calculadora {
	public static int sumar(int a, int b) 
				throws EnteroDesbordadoException, 
				MenorQueCeroException {
		
		validarOperadandos(a, b);
		
		long c = a + b;
		if (c > Integer.MAX_VALUE)
			throw new EnteroDesbordadoException();
			
		return (int)c;
	}

	public static int restar(int a, int b) 
			throws MenorQueCeroException, 
			SustraendoInvalidoException {

		validarOperadandos(a, b);
		
		if (b > a)
			throw new SustraendoInvalidoException(b);

		return a - b;
	}
	
	public static int multiplicar(int a, int b) 
			throws EnteroDesbordadoException, 
			MenorQueCeroException {
	
		validarOperadandos(a, b);
		
		long c = a * b;
		if (c > Integer.MAX_VALUE)
			throw new EnteroDesbordadoException();
			
		return (int)c;
	}
	
	public static int dividir(int a, int b)
			throws MenorQueCeroException, 
			DivisorCeroException,
			DivisionNoExactaException { 
	
		validarOperadandos(a, b);
		
		if (b == 0)
			throw new DivisorCeroException();
		if (a % b != 0)
			throw new DivisionNoExactaException();
			
		return a / b;
	}

	private static void validarOperadandos(int a, int b) 
			throws MenorQueCeroException {
		if (a < 0)
			throw new MenorQueCeroException(a);
		if (b < 0)
			throw new MenorQueCeroException(b);
	}
}
