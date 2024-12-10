package Ejercicio18;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el codigo del empleado");
        double codigo_empleado = sc.nextDouble();
        System.out.println("Ingrese el nombre del empleado");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido del empleado");
        String apellido = sc.next();
        String nombre_completo = nombre + " " + apellido
        System.out.println("Ingrese el numero de horas trabajadas");
        int horas_trabajadas = sc.nextInt();
        System.out.println("Ingrese el valor por hora trabajada");
        double valor_horas = sc.nextFloat();
        System.out.println("Ingrese el porcentaje de la retencion");
        double retencion_fuente = sc.nextFloat();
        
        double porcentaje_retencion = Empleado.calcular_porcentaje_retencion(retencion_fuente);
        double salario_bruto = Empleado.calcular_salario_bruto(valor_horas, horas_trabajadas);
        double salario_neto = Empleado.calcular_salario_neto(salario_bruto, porcentaje_retencion);
        
        System.out.println("Empleado: " + codigo_empleado);
        System.out.println("Nombre: " + nombre_completo);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Salario neto: " + salario_neto);
    }
}






