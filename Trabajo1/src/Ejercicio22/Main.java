package Ejercicio22;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el nombre del empeado:");
        String nombre = sc.next();
        System.out.println("Ingrese el valor a pagar por cada hora:");
        double salario_hora = sc.nextDouble();
        System.out.println("Ingrese el numero de horas trabajadas:");
        int numero_horas = sc.nextInt();
        
        salario = Empleado.calcular_salario(salario_hora, numero_horas);
        empleado = Empleado.empleado(salario, nombre);
    }
}
