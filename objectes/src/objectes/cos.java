package objectes;



	public class cos{
		//atributs
	static int energia;
	static int hambre;
	static int salut;
	static String papeles;
	
		
	//iniciarlitzem
		 public cos(){
			
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
				
				
				if (papeles == "No") {
				
					System.out.println("Lo sentimos mucho, pero sin un visado no puede acceder a nuestro país");
					cos.aduana();

						System.out.println("Tras pasar la aduana, nuestro hombre ha acabado asi:");
						System.out.println("Energia: " +energia);
						System.out.println("Salud: " + salut);
						System.out.println("Hambre: " + hambre);
				}				
				else {
					System.out.println("De acuerdo, todo está correcto. Disfrute de su estancia en nuestro país");
					cos.aduana();

						System.out.println("Tras pasar la aduana, nuestro hombre ha acabado asi:");
						System.out.println("Energia: " + energia);
						System.out.println("Salud: " + salut);
						System.out.println("Hambre: " + hambre);
						
				}
				
					
				}
			
			
		}

	
			
		
		
			
	
			