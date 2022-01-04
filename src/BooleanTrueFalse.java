import java.util.Scanner;

public class BooleanTrueFalse {

	/**
	 * Dise�ar un algoritmo que nos indique si podemos salir a la calle. Existen
	 * aspectos que influir�n en esta decisi�n: si est� lloviendo y si hemos
	 * terminado nuestras tareas. Solo podremos salir a la calle si no esta
	 * lloviendo y hemos finalizado nuestras tareas. Existe una opci�n en la que
	 * indistintamente de lo anterior, podremos salir a la calle: el hecho de que
	 * tengamos que ir a la biblioteca (realizar alg�n trabajo, entregar un libro,
	 * etc). Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado
	 * las tareas y si necesita ir a la biblioteca. El algoritmo debe mostrar
	 * mediante un booleano (true o false) si es posible que se le otorgue permiso
	 * para ir a la calle.*/
	 
	 

	public static void main(String[] args) {
	boolean llueve, finalizandoTareas, irBiblioteca;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("�Est� lloviendo? (true/false)");
	llueve= sc.nextBoolean();
	
	System.out.println("�Has finalizado tus tareas? (true/false)");
	finalizandoTareas= sc.nextBoolean();
	
	System.out.println("�Tienes que salir a la biblioteca? (true/false)");
	irBiblioteca= sc.nextBoolean();
	
	boolean salir= !llueve && finalizandoTareas || irBiblioteca; //TENGO DUDAS EN ESTA L�NEA
	System.out.println("Puedes salir: "+ salir);
	
	sc.close();
	
	


	}

}
