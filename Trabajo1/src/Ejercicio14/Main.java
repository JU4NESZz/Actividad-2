package Ejercicio14;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa las ventas del Departamento 1:");
        double VD1 = scanner.nextDouble();

        System.out.println("Ingresa las ventas del Departamento 2:");
        double VD2 = scanner.nextDouble();

        System.out.println("Ingresa las ventas del Departamento 3:");
        double VD3 = scanner.nextDouble();

        System.out.println("Ingresa el salario base de los vendedores:");
        double SALAR = scanner.nextDouble();

        double TOTVEN = VD1 + VD2 + VD3;
        double PORVEN = 0.33 * TOTVEN;

        double SALAR1, SALAR2, SALAR3;
        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;
        } else {
            SALAR1 = SALAR;
        }

        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR;
        } else {
            SALAR2 = SALAR;
        }

        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;
        } else {
            SALAR3 = SALAR;
        }

        System.out.println("Salario vendedores Departamento 1: $" + SALAR1);
        System.out.println("Salario vendedores Departamento 2: $" + SALAR2);
        System.out.println("Salario vendedores Departamento 3: $" + SALAR3);

        scanner.close();
       // 4200000, 250000, 3300000, 380320
    }
}