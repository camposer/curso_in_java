package formacion.java.clases;

import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Empleado e1 = new Empleado();
		e1.nombre = "Juan";
		e1.salario = 1000;
		e1.fechaNacimiento = new Date();
		System.out.println(e1.getDetalles());
		
		Gerente g1 = new Gerente();
		g1.nombre = "María";
		g1.salario = 2000;
		g1.fechaNacimiento = new Date();
		g1.departamento = "COMPRAS";
		System.out.println(g1.getDetalles());
		
		Director d1 = new Director();
		d1.nombre = "Pedro";
		d1.salario = 3000;
		d1.fechaNacimiento = new Date();
		d1.departamento = "VENTAS";
		d1.tieneCoche = true;
		d1.gastosCoche = 3000;
		System.out.println(d1.getDetalles());
		
		// POLIMORFISMO DE CLASE
		Gerente g2 = new Gerente();
		Empleado e2 = g2;
		e2.nombre = "Alicia";
		e2.salario = 5000;
		e2.fechaNacimiento = new Date();
		//e2.departamento = "VENTAS"; // Falla porque departamento no está definido en Empleado
		System.out.println(e2.getDetalles()); // Método virtual
		
		Gerente g3 = g2;
		if (e2 instanceof Gerente)
			g3 = (Gerente)e2;
		
		Gerente g4 = new Director();
		g4.nombre = "Petra";
		g4.salario = 6000;
		g4.fechaNacimiento = new Date();
		g4.departamento = "VENTAS"; 
		Director d2 = (Director)g4;
		d2.tieneCoche = true;
		((Director)g4).gastosCoche = 2000;
		System.out.println(g4.getDetalles());
		
	}
}

class Empleado {
	public String nombre; public double salario; public Date fechaNacimiento;
	public String getDetalles() {
		return "[ nombre = " + nombre +
				", salario = " + salario + "]";
	} 
}

class Gerente extends Empleado {
	public String departamento;
	@Override
	public String getDetalles() {
		return "[ nombre = " + nombre +
				", departamento = " + departamento +
				", salario = " + salario + "]";
	}
}

class Director extends Gerente {
	public boolean tieneCoche;
	public double gastosCoche;
	@Override
	public String getDetalles() {
		return "[ nombre = " + nombre +
				", departamento = " + departamento +
				", tieneCoche = " + tieneCoche +
				", salario = " + salario + "]";
	}
	
}