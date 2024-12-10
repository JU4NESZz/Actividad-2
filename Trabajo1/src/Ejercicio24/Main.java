package Ejercicio24;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el peso de la esfera A:");
        double a = sc.nextDouble();
        System.out.println("Ingrese el peso de la esfera B:");
        double b = sc.nextDouble();
        System.out.println("Ingrese el peso de la esfera C:");
        double c = sc.nextDouble();
        
        Esferas.compara_pesos(a, b, c);

        sc.close();
    }
}

