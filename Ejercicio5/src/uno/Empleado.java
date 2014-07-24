package uno;
import java.util.Date;

public class Empleado {
	public String nombre; 
	public double salario; 
	public Date fechaNacimiento;

	public Empleado() {
	}
	
	public Empleado(String nombre,
			double salario,
			Date fechaNacimiento) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	public String getDetalles() {
		return "[ nombre = " + nombre +
				", salario = " + salario + "]";
	} 
}
