import java.util.Date;


public class TestEmpleados {
	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[5];
		// 1.
		empleados[0] = new Gerente();
		empleados[0].nombre = "Juan";
		empleados[0].salario = 1000;
		((Gerente)empleados[0]).departamento = "VENTAS";
		
		// 2.
		Gerente g1 = new Gerente();
		g1.nombre = "María";
		g1.salario = 2000;
		g1.departamento = "COMPRAS";
		empleados[1] = g1;
				
		empleados[2] = new Director("Pedro",
				3000,
				new Date(),
				"COMPRAS",
				true,
				1000);
		empleados[3] = new Director("José",
				4000,
				new Date(),
				"OPERACIONES");
		empleados[4] = new Empleado();
		
		int indice = 0;
		for (Empleado e : empleados) {
			if (e instanceof Director)
				System.out.println(indice + ". Soy un Director");
			else if (e instanceof Gerente)
				System.out.println(indice + ". Soy un Gerente");
			else
				System.out.println(indice + ". Soy un Empleado");
			
			indice++;
		}
	}
}
