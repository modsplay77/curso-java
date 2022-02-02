package PAC2;
import java.util.Scanner;

//clase
public class clase {
	//esta clase debe crear objetos
	static String grupo;
	static String disco;
	static int año;
	static String cat;
	


//metodo mostrar objeto
public void mostrar() {
	
	
System.out.println("Grupo: "+ grupo);
System.out.println("Disco: " + disco);
System.out.println("Año: " + año);
System.out.println("Categoria: " + cat);

System.out.println("Guitarra: " + marca);
System.out.println("De: " + ncuerdas +" cuerdas");
System.out.println("De: " + npastillas + "pastillas dobles.");

System.out.println("Modelo: " + marca);

}

private static int ncuerdas;
private static int npastillas;
private static String marca;
private Scanner entrada;
private Scanner entrada1;
private Scanner entrada2;
private Scanner entrada3;


//constructor/método creador de nuevos objetos
public void nuevaentrada() {
	entrada = new Scanner(System.in);
	System.out.println("Nueva entrada: ¿Nombre grupo?:");
	grupo = entrada.nextLine();
	System.out.println("Has añadido:" + grupo);
	
entrada1 = new Scanner(System.in);
System.out.println("Nombre disco?:");
disco = entrada1.nextLine();
System.out.println("Has añadido:" + disco);

entrada2 = new Scanner(System.in);
System.out.println("Introduce año:");
año = entrada2.nextInt();
System.out.println("Has añadido:" + año);

entrada3 = new Scanner(System.in);
System.out.println("¿Que categoria son?:");
cat = entrada3.nextLine();
System.out.println("Has añadido:" + cat);

}
//Constructor nuevo objeto: 

public void guitarra(int ncuerdas, int npastillas , String marca) {
	this.ncuerdas = ncuerdas;
	this.npastillas= npastillas;
	this.marca= marca;
	

}

public void crearguitar() {
	// TODO Auto-generated method stub
	Scanner entrada = new Scanner(System.in);
	System.out.println("¿De cuentas cuerdas?:");
	ncuerdas = entrada.nextInt();
	
	Scanner entrada1 =new Scanner(System.in);
	System.out.println("¿Cuantas pastillas?:");
	npastillas = entrada.nextInt();
	
	Scanner entrada2 =new Scanner(System.in);
	System.out.println("¿Modelo cuerpo?:");
	marca = entrada2.nextLine();
	

	
}

public void funcion() {
	// TODO Auto-generated method stub
	Scanner accion = new Scanner(System.in);
	System.out.println("¿Quieres crear guitarras para los grupos?: Si (1), No (2)");
	int seleccion = accion.nextInt();
	

	if (seleccion == 1) {
		crearguitar();
	
	}else if (seleccion ==2) {
	
		mostrar();
		
	}else {
		System.out.println("No entendí bién, vuelve a provarlo");
		funcion();
}
}


}
