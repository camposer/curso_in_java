package dos;

public class Test {
	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[5];
		vehiculos[0] = new Auto();
		vehiculos[1] = new Auto("Juan", 5, 4);
		vehiculos[2] = new Camioneta("María", 3, 4);
		vehiculos[3] = new Camioneta("Pepe", 3, 4, 20f, (float)34.0);
		vehiculos[4] = new Vehiculo();
		
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo
					.getClass()
					.getSimpleName());
			
			//vehiculo.caracteristicas();
			System.out.println(vehiculo);
		} 
		
	}
}
