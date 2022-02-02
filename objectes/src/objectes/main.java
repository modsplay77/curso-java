package objectes;
import java.util.Scanner;

public class main {

	cos julio = new cos();
	
	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	
	System.out.println("¿Dispone de visado?: Si o No");
	String papeles = entrada.next();
	cos.control();
	
	
}

	
}