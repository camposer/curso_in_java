package uno;
import java.util.Date;

public class Gerente extends Empleado {
	public String departamento;
	
	public Gerente() {
	}
	public Gerente(String nombre,
			double salario,
			Date fechaNacimiento,
			String departamento) {

		super.nombre = nombre;
		this.salario = salario;
		super.fechaNacimiento = fechaNacimiento;
		this.departamento = departamento;
	}
	
	@Override
	public String getDetalles() {
		return "[ nombre = " + nombre +
				", departamento = " + departamento +
				", salario = " + salario + "]";
	}
	
}
