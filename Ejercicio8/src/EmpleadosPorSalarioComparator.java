import java.util.Comparator;


public class EmpleadosPorSalarioComparator 
	implements Comparator<Empleado> {
	
	public static final String ASC = "ASC";
	public static final String DESC = "DESC";
	private int factor;
	
	public EmpleadosPorSalarioComparator(String tipo) {
		if (tipo.equals(ASC))
			factor = 1;
		else
			factor = -1;
	}
	
	@Override
	public int compare(Empleado e1, Empleado e2) {
		if (e1.salario > e2.salario)
			return 1 * factor;
		else if (e1.salario == e2.salario)
			return 0;
		else
			return -1 * factor;
	}
}
