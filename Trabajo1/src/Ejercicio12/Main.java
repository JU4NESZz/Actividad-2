package Ejercicio12;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.println("Ingresa el nombre del trabajador:");
        String NOM = scanner.nextLine();

        System.out.println("Ingresa el número de horas trabajadas en la semana:");
        int NHT = scanner.nextInt();

        System.out.println("Ingresa el valor por hora normal de trabajo:");
        double VHN = scanner.nextDouble();

        double SALARIO;
        int HET, HEE8;
        
        if (NHT > 40) { 
            HET = NHT - 40;

            if (HET > 8) { 
                HEE8 = HET - 8; 
                SALARIO = 40 * VHN + 8 * 2 * VHN + HEE8 * 3 * VHN;
            } else {
                SALARIO = 40 * VHN + HET * 2 * VHN;
            }
        } else { 
            SALARIO = NHT * VHN;
        }
        System.out.println("El trabajador " + NOM + " devengó: $" + SALARIO);

        scanner.close();
    //"Elias Jose", 53,  4000
    }
}
