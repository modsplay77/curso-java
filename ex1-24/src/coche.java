
public class coche {
	//atributos
	
	private static String marca;
	private static String modelo;
	//constructor sin parametros
	public coche() {
		marca = "Porsche";
		modelo = "911 carrera";
		
	}
	//constructor con parametros
	public coche(String marca, String modelo){
		this.marca = marca;
		this.modelo = modelo;
	}
	public String getmarca() {
		return marca;
	}
	public String getmodelo() {
		return modelo;
	}
	
	static void canviar() {
		// TODO Auto-generated method stub
		{
			marca = "Audi";
			modelo = "TT";
			
			
		}
		
	}

	
	
}

	
	

