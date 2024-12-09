package Ejercicio10;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el numero de inscripcion: ");
		String NI = scanner.nextLine();
		System.out.println("Ingrese el nombre del estudiante: ");
		String N = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Ingrese el patrimonio del estudiante: ");
		double P = scanner.nextDouble();
		System.out.println("Ingrese el numero de inscripcion: ");
		scanner.nextLine();
		int ES = scanner.nextInt(); 
		
		Estudiante juanPablo = new Estudiante( NI, N, P, ES);
		
		
		//Estudiante Juan = new Estudiante("0001", "Juan Pablo", 1500000.0, 4);
	}

}
