package Ejercicio11;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el primer número (N1):");
        int N1 = scanner.nextInt();

        System.out.println("Ingresa el segundo número (N2):");
        int N2 = scanner.nextInt();

        System.out.println("Ingresa el tercer número (N3):");
        int N3 = scanner.nextInt();
      
        int MAYOR;
        if (N1 > N2 && N1 > N3) {
            MAYOR = N1;
        } else if (N2 > N3) {
            MAYOR = N2;
        } else {
            MAYOR = N3;
        }
        System.out.println("El valor mayor entre: " + N1 + ", " + N2 + " y " + N3 + " es: " + MAYOR);

        scanner.close();
        //25 26 56
    }
}
