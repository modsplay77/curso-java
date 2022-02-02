
package AnimalesGranja;

import java.util.Scanner;

public class main {



	

	
	private static Scanner cont;
	private static boolean contador;

	public static void main(String[] args) {
		 
		
	
	
	
		do {
		
	AnimalesGranja modelo =new AnimalesGranja();
	
         modelo.nuevaentrada();
         
         modelo.funcion();
         
         continuar();
      
       
		}
	
	while (contador != false);
	}
private static boolean continuar() {
	cont = new Scanner(System.in);
		System.out.println("¿Quieres añadir otro animal e interactuar con él?:true o false");
		
		return contador = cont.nextBoolean();
		
	}



}