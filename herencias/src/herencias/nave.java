/**
 * 
 */
package herencias;

/**
 * @author studi
 *
 */
//clase padre
public class nave {
	
	//ATRIBUTOS
	int potencia;
	boolean armada;
	boolean civil;
	boolean mercante;
	boolean prisioneres;
	static int crew;
	static int velocidad;
	
	// INICIALIZAMOS PARAMETROS
	public nave() {
		velocidad = 0;
		crew=0;
			
		}

	//METODOS
	
	public void acelerar() {
		velocidad = 1000;
		
	}
public void cargar() {
	crew = 10;
		
	}
public void despegar() {
	velocidad = 100;
	
}
public void sideral() {
	velocidad = 300000;
	
}

	
	
	
	
	
	
	
	


}
