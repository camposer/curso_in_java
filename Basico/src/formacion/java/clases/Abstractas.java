package formacion.java.clases;

public class Abstractas {
	public static void main(String[] args) {
		Vehiculo[] vehiculos = new Vehiculo[5];
		vehiculos[0] = new Camion(0);
		vehiculos[1] = new Camion(2);
		vehiculos[2] = new Barcaza();
		vehiculos[3] = new Barcaza();
		
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println("Aceleración: " + 
					vehiculo.calcularAceleracion());
			System.out.println("Distancia viaje: " + 
					vehiculo.calcularDistanciaViaje());
			System.out.println("Eficiencia combustible: " +
					vehiculo.calcularEficienciaCombustible());
		}
	}
}

abstract class Vehiculo {
	public abstract double calcularEficienciaCombustible();
	public abstract double calcularDistanciaViaje();
	public double calcularAceleracion() {
		return 0;
	}
}

class Camion extends Vehiculo {
	public Camion(int cargaMaxima) {
		
	}

	@Override
	public double calcularDistanciaViaje() {
		return 1;
	}

	@Override
	public double calcularEficienciaCombustible() {
		return 1;
	}
}

class Barcaza extends Vehiculo {

	@Override
	public double calcularEficienciaCombustible() {
		return 2;
	}

	@Override
	public double calcularDistanciaViaje() {
		return 2;
	}
	
}
