package dia2;
import java.util.Scanner;
public class  {
	public static void main(String[] args) {
		
		Scanner entrada1 = new Scanner (System.in);
		System.out.println("Introduce la primera cifra:");
		
		int c1 = entrada1.nextInt();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Introduce la segunda cifra:");
		int c2 = entrada2.nextInt();
		
	
		 if (c1!=0 && c2!=0) {
			 
			int suma;
			suma = c1 + c2;
			switch (suma) {
			case 1:
			System.out.println("La suma de los dos numeros es:"+ suma);
		
		}
		 }
	}
