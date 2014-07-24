package uno;
import java.util.Date;


public class Director extends Gerente {
	public boolean tieneCoche;
	public double gastosCoche;
	
	public Director(String nombre, 
			double salario,
			Date fechaNacimiento,
			String departamento
			) {
		
		this(nombre, 
				salario, 
				fechaNacimiento, 
				departamento, 
				false,
				0); // Llama al otro constructor (el que recibe todos los parámetros)
	}

	public Director(String nombre, 
			double salario,
			Date fechaNacimiento,
			String departamento,
			boolean tieneCoche,
			double gastosCoche
			) {
		
		super(nombre, salario, fechaNacimiento, departamento);
		this.tieneCoche = tieneCoche;
		this.gastosCoche = gastosCoche;
	}
	
	public Director(String nombre, 
			double salario,
			String departamento
			) {
		
		super(nombre, salario, null, departamento);
	}

	@Override
	public String getDetalles() {
		return "[ nombre = " + nombre +
				", departamento = " + departamento +
				", tieneCoche = " + tieneCoche +
				", salario = " + salario + "]";
	}
}
