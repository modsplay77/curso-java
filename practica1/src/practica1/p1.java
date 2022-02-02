package practica1;

	public class p1{
		//atributs
		int edad;
		int salut;
		int hambre;
		int energia;
		char sexe;
		boolean papeles;
		String origen;
		
	//iniciarlitzem
		public p1(){
			
			salut = 100;
			hambre = 0;
			energia =100;
		
		}
			
			//metodos
		public static void aduana() {
			energia = energia - 50;
			salut = salut - 20;
			hambre = hambre + 50;
			}

			public static void control() {
				
				
				if (papeles !=true) {
					System.out.println("Lo sentimos mucho, pero sin un visado no puede acceder a nuestro país");
			
						System.out.println("Tras pasar la aduana, nuestro hombre ha acabado asi:");
						System.out.println("Energia: " +energia);
						System.out.println("Salud: " + salut);
						System.out.println("Hambre: " + hambre);
				}
						
				
				 else {
					System.out.println("de acuerdo, todo está correcto. Disfrute de su estancia en nuestro país");
				
						System.out.println("Tras pasar la aduana, nuestro hombre ha acabado asi:");
						System.out.println("Energia: " +energia);
						System.out.println("Salud: " + salut);
						System.out.println("Hambre: " + hambre);
						
						}
				
					
				}
			
			
		}
		
			
		
			