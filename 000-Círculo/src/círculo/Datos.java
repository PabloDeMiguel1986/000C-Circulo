package círculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Datos {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader teclado = new BufferedReader( new InputStreamReader(System.in));
		
		double radio;
		double longitud;
		double superficie;
		
		System.out.println("introduzca radio:");
		radio = Double.parseDouble(teclado.readLine());
		
		longitud = 2* Math.PI * radio;
		superficie = Math.PI * Math.pow(radio, 2);
		
		System.out.print("la longitud es de: " + longitud);
		System.out.print("La superficie es de: " + superficie);
		
		
		
		

	}

}
