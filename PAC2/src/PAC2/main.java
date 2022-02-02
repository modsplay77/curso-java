package PAC2;
import java.util.Scanner;

public class main {

	private static Scanner cont;
	private static boolean contador;
	public static void main(String[] args) {
		 	
	do {
	clase modelo =new clase();
         modelo.nuevaentrada(); 
         modelo.funcion();
         modelo.mostrar();
         continuar();
		}
	
	while (contador != false);
	}
private static boolean continuar() {
	cont = new Scanner(System.in);
		System.out.println("¿Quieres añadir otro grupo:true o false");
		
		return contador = cont.nextBoolean();
		
	}
}