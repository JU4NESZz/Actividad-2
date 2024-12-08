package Primero;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		/*LEA: A, B
		SI A > B ENTONCES
		ESCRIBA: «A ES MAYOR QUE B»
		SINO
		SI A = B ENTONCES
		ESCRIBA: «A ES IGUAL A B»
		SINO
		ESCRIBA: «A ES MENOR QUE B»
		FIN_SI
		FIN_SI
		FIN_INICIO*/
	
 Scanner scanner = new Scanner(System.in);
System.out.println("Ingresa el valor de A: \n" );		
 int A = scanner.nextInt();
 System.out.println("Ingresa el valor de B: \n" );	
 int B = scanner.nextInt();
 
 System.out.println("Valores de A: " + A + " Valores de B " + B );	
	
 if(A>B) {
	 System.out.println("A es mayor a B");
	 
 }else {
	 System.out.println("A es menor que B");
	 
 }

	}

}
