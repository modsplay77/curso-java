import java.util.Scanner;

public class main {
	static boolean contador;
	static int op;
	static int bateria;
	static String prueba = " ";
	private static Scanner opcion;
	public main() {
	}

	public static void main(String[] args) {
	//creamos la interaccion
		

		droid.crear();
		droid mod = new droid();
		
	
			mod.on();
			mod.inicio();
			mod.acciones();
do while (bateria <=10) {
			main.seleccion();

	 
			switch (op) {
		case 1: {
			mod.accion1();
			mod.bateria();
		} break;
		case 2:{
			mod.accion2();
			mod.bateria();
		}break;
		case 3:{
			mod.accion3();
			mod.bateria();
		}
			break;
		case 4:{
			mod.accion4();
			mod.bateria();
		}
			break;
		case 5: {
			mod.accion5();
			mod.bateria();
		}
		break;
		case 6:{
			mod.accion6();
			mod.bateria();
		}break;
		case 7:{
			mod.off();
			mod.continuar();
			mod.crear();
			
		}break;
	default: {mod.mas();}
		}
}	
			while (bateria<=10);{
				
				mod.off();
				mod.crear();
				}
			mod.continuar();

	}
	
	private static int seleccion() {
		opcion = new Scanner(System.in);
		System.out.print("¿Que acción seleccionas?");
		return op = opcion.nextInt();
		
	}

	
}

