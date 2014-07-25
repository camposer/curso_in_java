package formacion.java.exception;

public class SumarArgumentos {
	public static void main(String[] args) {
		// primerEnfoque(args); 
		//segundoEnfoque(args);
		//tercerEnfoque(args);
		try {
			cuartoEnfoque(args);
		} catch (Exception e) {
			if (e instanceof NumeroMenorQueCeroException) {
				System.out.println("El número " + 
						((NumeroMenorQueCeroException)e)
						.getNumero() + " es menor que 0");
			} else if (e instanceof NumberFormatException) {
				System.out.println("Uno de los parámetros es string");
			}

			System.err.println("Error general!!!");
			//e.printStackTrace();
		}
	}

	/**
	 * Si consigue un caracter inválido o un número negativo termina con la ejecución arrojando la excepción a quien llamó
	 * @param args
	 */
	private static void cuartoEnfoque(String[] args) throws Exception {
		int sum = 0;
		System.out.print("Argumentos: ");
		for (String string : args) {
			System.out.print(string + ", ");
			try {
				int numero = Integer.parseInt(string);
				if (numero < 0)
					throw new NumeroMenorQueCeroException(numero);
					
				sum += numero;
			} finally {
				System.out.println("Cualquier cosa que se haga al final");
			}
		}
		System.out.println("\nLa suma total es: " + sum);
	}

	/**
	 * Si consigue un caracter inválido o un número negativo continua con la ejecución ignorando el valor
	 * @param args
	 */
	private static void tercerEnfoque(String[] args) {
		int sum = 0;
		System.out.print("Argumentos: ");
		for (String string : args) {
			System.out.print(string + ", ");
			try {
				int numero = Integer.parseInt(string);
				if (numero < 0)
					throw new NumeroMenorQueCeroException(numero);
					
				sum += numero;
			} catch (NumberFormatException e) {
				System.out.println(string + " no es un número");
				//e.printStackTrace();
			} catch (NumeroMenorQueCeroException e) {
				System.out.println(string + " es menor que 0");
				//e.printStackTrace();
			} finally {
				System.out.println("Cualquier cosa que se haga al final");
			}
		}
		System.out.println("\nLa suma total es: " + sum);
	}

	/**
	 * Si consigue un caracter inválido continua con la ejecución ignorando el valor
	 * admite número negativos
	 * @param args
	 */
	private static void segundoEnfoque(String[] args) {
		int sum = 0;
		System.out.print("Argumentos: ");
		for (String string : args) {
			System.out.print(string + ", ");
			try {
				sum += Integer.parseInt(string);
			} catch (NumberFormatException e) {
				System.out.println(string + " no es un número");
				//e.printStackTrace();
			} catch (Exception e) {
				System.err.println("Error inesperado");
			} finally {
				System.out.println("Cualquier cosa que se haga al final");
			}
		}
		System.out.println("\nLa suma total es: " + sum);
	}

	/**
	 * En cuanto consigue un caracter inválido detiene la ejecución
	 * admite número negativos
	 * @param args
	 */
	private static void primerEnfoque(String args[]) {
		int sum = 0;
		try {
			System.out.print("Argumentos: ");
			for (String string : args) {
				System.out.print(string + ", ");
				sum += Integer.parseInt(string);
			}
			System.out.println("\nLa suma total es: " + sum);
		} catch (NumberFormatException e) {
			System.err.println("\nUno de los parámetros no es correcto");
			e.printStackTrace();
		}
	}
}
