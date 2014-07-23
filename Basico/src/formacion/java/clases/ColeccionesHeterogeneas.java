package formacion.java.clases;

public class ColeccionesHeterogeneas {
	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[5];
		empleados[0] = new Director();
		empleados[1] = new Gerente();
		empleados[2] = new Director();
		empleados[3] = new Empleado();
		empleados[4] = new Empleado();
		
		empleados[0].nombre = "Juan";
		((Director)empleados[0]).tieneCoche = true;
	}
}
