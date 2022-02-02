package poli;

public class depor extends poli implements vehiculo{

boolean carga;
int vel;

	public depor() {
		// TODO Auto-generated constructor stub
		//seran deportivos
		 vel = 200;
			
		carga = false;
		
	}
	public depor(String marca, String modelo) {
		  super();
		  this.marca = marca;
		  this.modelo = modelo;
		  
	
		}
	
	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
	
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
	
		System.out.println("Carga:" + carga);
	
	}

	@Override
	public void categoria() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void comparar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public int correr() {
		// TODO Auto-generated method stub
		System.out.println("Velocidad:" + vel);
		return vel;
		
	}


	

}
