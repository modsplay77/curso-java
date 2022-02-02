/**
 * 
 */

/**
 * @author studi
 *
 */
import java.util.Locale;
import java.util.Scanner;

public class droid implements funciones {
	//Atrinbutos droide
	
	static String mod;
	Scanner modelo;
	String memoria;
	static Locale op;
	Scanner run;
	static int bateria;
	private static Scanner opcion;
	private static Scanner entrada;
	private Scanner cont;
	private Scanner mas;
	
	


	
	
	public droid() {
	
		bateria=100;

	}
	



	@Override

	public boolean on()  {
	//Preguntamos al usuario si quiere encender droid, al encender gasta un 5% de bateria
		System.out.println("Querido usuario,¿quieres encender al droide?:");
		run = new Scanner(System.in);
		return run.hasNext();
	
		
	}

	@Override
	public void off() {
		System.out.println("A dormir...");

		
		
	}

	@Override
	public int inicio() {
		//saludar y mostrar opciones
		System.out.println("Hola, me llamo " + mod);
		
		bateria = bateria - 5;
		return bateria;
}

	@Override
	public int acciones() {
		// TODO Auto-generated method stub
		System.out.println("Estas son las funciones que puedo hacer para ti:.");
		System.out.println("1-Puedo limpiar la casa.");
		System.out.println("2-Preparar cafe.");
		System.out.println("3-Preparar algo de comer.");
		System.out.println("4-Pasear a la mascota.");
		System.out.println("5-Leer una novela");
		System.out.println("6-Informarte de la previsón del tiempo");
		System.out.println("7-Nada, y volver a apagarme.");
		
		//Despues de esta acción pierde un 5% de bateria
		bateria = bateria -5;
		return bateria;
		
	
		
	}
	
	@Override
	public int accion1() {
		System.out.println("De acuerdo,limpiaré tu casa.");
		//Al final ha perdido el 20% de bateria restante.
		bateria = bateria -20;
		return bateria;
		
	}

	@Override
	public int accion2() {
		System.out.println("De acuerdo, marchando un cafe solo.");
		bateria = bateria -10;
		return bateria;
	
		
	}

	@Override
	public int accion3() {
		System.out.println("De acuerdo, te preparo un bocata.");
		bateria = bateria -5;
		return bateria;
		
		
	}

	@Override
	public int accion4() {
		System.out.println("Vale, me llevo a pasear a tu perro.");
		bateria = bateria -30;
		return bateria;
		
	}

	@Override
	public int accion5() {
		System.out.println("De acuerdo, empezamos el libro Cien años de soledad");
		bateria = bateria -10;
		return bateria;
		
	}

	@Override
	public int accion6() {
		System.out.println("Esta hecho, según lo que he sacado de internet, hoy se espera...");
		bateria = bateria -5;
		return bateria;
		
	}

	@Override
	public int bateria() {
		System.out.println("Bateria restante: " + bateria);
		return bateria;		
	}

public boolean mas() {
	mas = new Scanner(System.in);
	System.out.println("¿Quieres que haga otra cosa?:true o false");
	
	return mas.nextBoolean();
	
}



	public static String crear() 	{
		entrada = new Scanner(System.in);
	
		System.out.print("¿Que modelo quieres crear?");
		
		return mod = entrada.nextLine();
		
		
		
		
	}



	public boolean continuar() {
		cont = new Scanner(System.in);
		System.out.println("¿Quieres otro droide?:true o false");
		
		return cont.nextBoolean();
		
	}







	
}
