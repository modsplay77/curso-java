package dia2;
import java.util.Arrays;

public class arrays {
	public static void main(String[] args) {
		/*
		//declaramos e inicializamnos una matriz del tipo string con sus datos
		String[]estudiantes = {"Albert","Pepe","Montse","Javi","Gemma","Carlos","Jose","Richard","jkjk","lhiut870"};
		
		//pedimos que salga por pantalla uno de los resultados, el 3.. que es el 4to nombre almacenado.
		System.out.println(estudiantes[3]);
		}
		*/
		String[] videojocs = {"Gears of war","COD","Warhammer","TitanFall"};

		

		
		System.out.println(Arrays.asList(videojocs));
        Arrays.stream(videojocs).forEach(System.out::println);  
		System.out.println(videojocs[1]);
		
}
}
