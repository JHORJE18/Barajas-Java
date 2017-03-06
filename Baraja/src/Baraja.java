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
	
	public static void baraja(){
		
	}
	
	public static void getCarta(){
		//Comprobamos que no este vacia la baraja
		if (baraja.empty()){
			baraja.pop().mostrar();
		}	else	{
			System.out.println("La baraja esta vacia, baraja de nuevo primero");
		}
	}
	
	public static boolean confirma(String mensaje){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Estas seguro de que quieres " + mensaje);
		System.out.println("1. Si, quiero " + mensaje);
		System.out.println("2. No, no quiero " + mensaje);
		int seguro = entrada.nextInt();
		if (seguro == 1){
			return true;
		}	else	{
			System.out.println("Cancelado");
		}
		return false;		
	}
	
}
