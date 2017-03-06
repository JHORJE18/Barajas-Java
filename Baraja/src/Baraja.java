import java.util.Stack;
import java.util.Scanner;

public class Baraja {
	
	//Variables
	static Stack<Carta> baraja = new Stack<Carta>();
	static estetica ds = new estetica();

	public static void main(String[] args){
		ds.titulo();
		menu();
		System.out.println("Programa finalizado correctamente");
	}
	
	public static void menu(){
		Scanner entrada = new Scanner(System.in);
		
		boolean salir = false;
		while (!salir){
			System.out.println("Que quieres hacer?");
			System.out.println("1. Barajar las cartas");
			System.out.println("2. Dar la vuelta a la ultima carta");
			System.out.println("3. Salir");
			int opcion = entrada.nextInt();
			
			switch (opcion){
			case 1:
				baraja();
				break;
			case 2:
				getCarta();
				break;
			case 3:
				if (confirma("salir")){
					salir = true;
				}
				break;
			default:
				System.out.println("La opcion escogida no es valida");
			}
		}
	}
	
}
