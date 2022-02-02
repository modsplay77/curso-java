/**
 * 
 */
package herencias;

/**
 * @author studi
 *
 */
public class main {



	/**
	 * @param args
	 */
	//MAIN
	public static void main(String[] args) {
		// INSTANCIO UN OBJETO DESDE NAVE
	nave halconmilenario =new nave();
	halconmilenario.cargar();

System.out.println("Tripulación:" + halconmilenario.crew);
	
halconmilenario.despegar();

System.out.println("despega:" + halconmilenario.velocidad);

	halconmilenario.acelerar();

System.out.println("Acelera:" + halconmilenario.velocidad);

	halconmilenario.sideral();

System.out.println("Supersonica:" + halconmilenario.velocidad);

	//Instancio una nave de la clase Enterprise
	enterprise xwing = new enterprise();

	}

}
