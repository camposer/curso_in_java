import exception.DivisionNoExactaException;
import exception.DivisorCeroException;
import exception.EnteroDesbordadoException;
import exception.MenorQueCeroException;
import exception.SustraendoInvalidoException;
import logica.Calculadora;

public class Test {
	public static void main(String[] args) {
		try {
			System.out.println("-1+3="+Calculadora.sumar(-1, 3));
		} catch (EnteroDesbordadoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MenorQueCeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("2-3="+Calculadora.restar(2, 3));
		} catch (MenorQueCeroException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SustraendoInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("2*3="+Calculadora.multiplicar(2, 3));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			System.out.println("4/0="+Calculadora.dividir(4, 0));
		} catch (MenorQueCeroException | DivisorCeroException
				| DivisionNoExactaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
