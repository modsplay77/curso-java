package AnimalesGranja;


import java.util.Scanner;

public class AnimalesGranja{
	//atributos
	static int hambre;
	static int salut;
	static int animo;
	static int cansancio;
	private static Scanner entrada;
	private static Scanner entrada2;
	private static Scanner entrada3;
	private static String modelo;
	private static Scanner especie;
	private static String nombre;
	private static int edad;
	private static int ncorral;
	static int selección;
	private static int seleccion;
	private static Scanner accion;
	
	
	
	//inicializamos atributos para todos los animales
	public AnimalesGranja(){ 
	  hambre = 0;
	  salut= 100;
	  animo= 80;
	  cansancio= 20;
	}
	//objetos nuevos heredados
		
	
/*	public class cerdo(String nombre, int edad, int ncorral){
		this.nombre = nombre;
		this.edad = edad;
		this.ncorral = ncorral;
		
	}
	
public class cordero(String nombre, int edad, int ncorral){
	this.nombre = nombre;
	this.edad = edad;
	this.ncorral = ncorral;
		
	}
*/
	/*constructor sin parametros
	public coche() {
		marca = "Porsche";
		modelo = "911 carrera";
		
	}*/
	//constructor con parametros

	



//metodos


public static void mostrar() {
System.out.println("Hambre: " + hambre);
System.out.println("Salut: " + salut);
System.out.println("Ánimo: " + animo);
System.out.println("Cansancio: " + cansancio);



}

public static void alimentar() {
	// TODO Auto-generated method stub
	
		hambre = hambre - 10;
		salut= salut + 5;
		animo = animo + 5;
		cansancio = cansancio - 5;
		
}
public static void correr() {
	// TODO Auto-generated method stub
	
		hambre = hambre + 10;
		salut= salut + 5;
		animo = animo + 5;
		cansancio = cansancio + 30;
		
}


public void funcion() {
	accion = new Scanner(System.in);
	System.out.println("Que hacemos con el animal? Elige una opción:Alimentar (1), Hacer correr (2), Mostrar estado (3)");
	seleccion = accion.nextInt();
	

	if (seleccion == 1) {
		alimentar();
		System.out.println("lo hemos cebado y este es su estado actual:");
		mostrar();

		
	}else if (seleccion ==2) {
		correr();
		System.out.println("Un poco de ejercicio...y este es su estado actual:");
		mostrar();
		
	}else {
		System.out.println("Este es su estado actual:");
		mostrar();
	}
	//falta hacerlo en bucle
}


		
	public void nuevaentrada() {
		especie = new Scanner(System.in);
		System.out.println("Nueva entrada: Gallina, cerdo o cordero?");
		String modelo = especie.nextLine();
		
		
		
		System.out.println("Has eligido:" + modelo);
	entrada = new Scanner(System.in);

	
	System.out.println("Entrada de nueva: Introduce nombre:");
	nombre = entrada.nextLine();

entrada2 = new Scanner(System.in);

	
	System.out.println("Introduce edad:");
	edad = entrada2.nextInt();
	
 entrada3 = new Scanner(System.in);

	
	System.out.println("Introduce número de corral:");
	ncorral = entrada3.nextInt();
	
}
	
	
public class gallina extends AnimalesGranja{
	


	private String nombre;
	private int edad;
	private int ncorral;

	public gallina() {
		super();
	}

}
public class cerdo extends AnimalesGranja{
	


	private String nombre;
	private int edad;
	private int ncorral;

	public cerdo() {
		super();
	}

}
public class cordero extends AnimalesGranja{
	


	private String nombre;
	private int edad;
	private int ncorral;

	public cordero() {
		super();
	}

}
}






	
	
