package Primero;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
System.out.println("Ingresa el valor de A: \n" );		
 int A = scanner.nextInt();
 System.out.println("Ingresa el valor de B: \n" );	
 int B = scanner.nextInt();
	
 if(A>B) {
	 System.out.println("A es mayor a B");
	 
 }else {
	 System.out.println("A es menor que B");
	 
 }

	}

}
