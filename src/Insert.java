import java.lang.reflect.Array;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Insert {

	public static void main(String[] args) {

		Scanner miScanner = new Scanner(System.in);

		System.out.print("Dame el nombre de la tabla :");
		Random ran = new Random();
		String nombreTabla = miScanner.nextLine();

		ArrayList<String> nombres = new ArrayList<String>(
				Arrays.asList("luis", "alvaro", "daniel", "lucas", "pedro", "jerry"));
		ArrayList<String> apellidos = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));

		LocalDate fNacimiento = LocalDate.of(1972, Month.MAY, 23);

		System.out.println(fNacimiento);

		for (int i = 0; i < nombres.size() * 5; i++) {

			int aleatorio = ran.nextInt(nombres.size());
			int aleatorio2 = ran.nextInt(apellidos.size());

			int numerico = (int) (Math.random() * 10 + 1);

			String listado = nombres.get(aleatorio);
			String listadoape = apellidos.get(aleatorio2);
			System.out.printf("INSERT INTO " + nombreTabla + " VALUES (" + '"' + listado + '"' + "," + '"' + listadoape
					+ '"' + "," + numerico + ");");
			System.out.println();

		}
	}

}
