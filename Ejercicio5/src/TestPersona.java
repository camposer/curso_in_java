
public class TestPersona {
	public static void main(String[] args) {
		SerVivo sv = new Persona();
		imprimir(sv);
	}

	private static void imprimir(SerVivo sv) {
		sv.comer();
		sv.respirar();
		if (sv instanceof Persona) {
			((Persona)sv).comer(20);
			((Persona)sv).caminar();
		}
	}
}
