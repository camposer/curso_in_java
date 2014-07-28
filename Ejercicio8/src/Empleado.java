import java.util.Date;

public class Empleado 
		implements Comparable<Empleado> {
	
	public String nombre;
	public double salario;
	public Date fechaNacimiento;

	public Empleado() {
	}

	public Empleado(String nombre, double salario, Date fechaNacimiento) {
		this.nombre = nombre;
		this.salario = salario;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDetalles() {
		return "[ nombre = " + nombre + ", salario = " + salario + "]";
	}

	@Override
	public int compareTo(Empleado e) {
		if (this.salario > e.salario)
			return 1;
		else if (this.salario == e.salario)
			return 0;
		else
			return -1;
	}
}
