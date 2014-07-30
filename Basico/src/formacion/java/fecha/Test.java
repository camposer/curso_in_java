package formacion.java.fecha;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Test {
	public static void main(String[] args) throws Exception {
		Date ahora = new Date(); // now()
		System.out.println(ahora);
		
		// Ejemplo ayer (fijo)
		Calendar cal = Calendar.getInstance(); // Singleton/Solitaria. Devuelve una instancia de Calendar
		cal.set(Calendar.DAY_OF_MONTH, 29);
		cal.set(Calendar.MONTH, Calendar.JULY);
		cal.set(Calendar.YEAR, 2014);
		Date ayer = cal.getTime();
		System.out.println(ayer);
		
		// Ejemplo ayer (contextual)
		cal = Calendar.getInstance();
		cal.setTime(ahora);
		int dia = cal.get(Calendar.DAY_OF_MONTH);
		cal.set(Calendar.DAY_OF_MONTH, dia - 1);
		int diaAyer = cal.get(Calendar.DAY_OF_MONTH);
		ayer = cal.getTime();
		
		// Obteniendo fecha de string
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String fecha = "2012-02-02";
		Date f1 = sdf.parse(fecha);
		
		// Obteniendo un string a partir de una fecha
		String fechaFormateada = sdf.format(f1);
		System.out.println(fechaFormateada);
				
		System.out.println(new SimpleDateFormat("dd MMMM yyyy", new Locale("es")).format(f1));
		
		// Convirtiendo una java.util.Date en una java.sql.Date
		java.sql.Date fechaBD = new java.sql.Date(f1.getTime());
		
	}
}
