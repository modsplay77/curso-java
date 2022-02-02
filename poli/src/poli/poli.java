package poli;
public class poli implements vehiculo {
	
	static int id;
	String marca;
	String modelo;
	int vel;


	public poli() {
		// TODO Auto-generated constructor stub
		
	
	}




	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		
		
	}

	@Override
	public void categoria() {
		// TODO Auto-generated method stub
	
	}

	

	@Override
	public void comparar() {
		// TODO Auto-generated method stub
		
	}



	public int correr() {
		// TODO Auto-generated method stub
		return vel;
	}

	
	





	

}
