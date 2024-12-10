package Ejercicio23;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingrese el valor de a:");
        double a = sc.nextDouble();

        while (a == 0) {
            System.out.println("El valor de a debe ser diferente de 0 para que sea una ecuación de segundo grado.");
            System.out.println("Ingrese nuevamente el valor de a:");
            a = sc.nextDouble();
        }
        
        System.out.println("Ingrese el valor de b:");
        double b = sc.nextDouble();
        
        System.out.println("Ingrese el valor de c:");
        double c = sc.nextDouble();
        
        solucion = CalculoEcuacionSegundoGrado.calcularSoluciones(a, b, c);

        sc.close();
    }
}
