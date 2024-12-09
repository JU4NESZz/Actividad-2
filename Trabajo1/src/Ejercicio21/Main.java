package Ejercicio21;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double altura, perimetro, semiperimetro, area;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ingrese el valor de un lado");
        double lado_1 = sc.nextDouble();
        double lado_2 = sc.nextDouble();
        double lado_3 = sc.nextDouble();
        
        perimetro = triangulo.calcular_perimetro(lado_1, lado_2, lado_3);
        semiperimetro = triangulo.calcular_semiperimetro(perimetro);
        area = triangulo.calcular_altura(lado_1, lado_2, lado_3, semiperimetro);
        
        System.out.println("Su perimetro es: " + perimetro);
        System.out.println("Su semiperimetro es: " + semiperimetro);
        System.out.println("Y su area es: " + area);
    }
}
