import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class TestEmpleados {
	public static void main(String[] args) {
		List<Empleado> empleados = new LinkedList<Empleado>();
		empleados.add(new Director("Juan", 3000, "COMPRAS")); // 0
		empleados.add(new Director("María", 5000, new Date(), // 1
				"VENTAS", true, 1000));
		
		Gerente g = new Gerente();
		g.nombre = "Pepe";
		g.salario = 2000;
		g.departamento = "OPERACIONES";
		empleados.add(g); // 2
		
		empleados.add(new Gerente("José", 5000, 
				new Date(), null)); // 3
		Empleado e = empleados.get(3); 
		e.nombre = "Joselo";
		((Gerente)e).departamento = "TI";
		
		empleados.add(new Empleado()); // 4
		
//		System.out.println(empleados.get(99).nombre); // NullPointerException 
		
		Collections.sort(empleados); // Ordena utilizando como criterio el método compareTo dentro de Empleado
		Collections.sort(empleados, 
				new EmpleadosPorSalarioComparator(
							EmpleadosPorSalarioComparator.ASC
						));
		
		Iterator<Empleado> i = empleados.iterator();
		while(i.hasNext()) {
			Empleado e1 = i.next();
			System.out.println(e1.getDetalles()); // Método virtual!!

			/*
			System.out.println("Nombre: " + e1.nombre);
			System.out.println("Salario: "+ e1.salario);
			System.out.println("Fnac: " + e1.fechaNacimiento);
			
			if (e1 instanceof Gerente)
				System.out.println("Departamento: " + 
						((Gerente)e1).departamento);
			
			if (e1 instanceof Director) {
				Director d = (Director)e1;
				System.out.println("Tiene coche? " + d.tieneCoche);
				System.out.println("Gastos: " + d.gastosCoche);
			}
			*/
			System.out.println();
		}
		
		
	}
}
