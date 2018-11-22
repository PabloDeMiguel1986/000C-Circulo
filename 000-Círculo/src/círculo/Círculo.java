package círculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Círculo {

	public static void main(String[] args) throws IOException {
		BufferedReader teclado = new BufferedReader( new InputStreamReader(System.in));
		//Habilita poder leer cosas desde el teclado.
		String nombre;
		nombre = teclado.readLine(); 
		//cuando aparece esto se espera que el usuario introduzca información
		/*//Constant
		final double PI = Math.PI; // las constantes llevan siempre delante final,
		//no hubiese sido encesario declarar la constante sino que se pone directamente en el proceso
		*/
		// Variable
		int radio;
		double longitud;
		double superficie;
		
		//Initialization
		radio = 15;
		
		//Process
		longitud = 2* Math.PI * radio;
		superficie = Math.PI * Math.pow(radio, 2);
		
		//Out
		System.out.println ("el radio es de " + radio );
		System.out.println ("La longitud es de " + longitud );
		System.out.println ("La superficie es de " + superficie );

	}

}
