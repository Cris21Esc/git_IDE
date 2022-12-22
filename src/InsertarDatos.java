import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class InsertarDatos {

	public static void main(String[] args) {

		BufferedReader bufferLectura = null;

	    Scanner miScanner = new Scanner(System.in);

        System.out.print("Dame el nombre de la tabla :");

    	String nombreTabla =miScanner.nextLine();
		
		String inser = "insert into ";
	
		int numerico =0;
		String ruta = "/home/lah/eclipse-workspace/Datos/datos/Datos.csv";
		try {

			bufferLectura = new BufferedReader(new FileReader(ruta));

			String linea = bufferLectura.readLine();

			while (linea != null) {
				numerico=(int)(Math.random()*10+1);
				String[] campos = linea.split(",");

				System.out.println(inser + nombreTabla + " values (" + campos[0] + "),"+ numerico +"," + "(" + campos[1] + ")," + "("
						+ campos[2] + ");");

				linea = bufferLectura.readLine();
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
