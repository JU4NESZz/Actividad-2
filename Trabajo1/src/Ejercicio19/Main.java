package Ejercicio19;
import java.util.Scanner;

	class Main {
	    public static void main(String[] args) {
	        double altura, perimetro, area;
	        Scanner sc = new Scanner (System.in);
	        System.out.println("Ingrese el valor de un lado: ");
	        double lado = sc.nextDouble();
	        
	        altura = triangulo_equilatero.calcular_altura(lado);
	        perimetro = triangulo_equilatero.calcular_perimetro(lado);
	        area = triangulo_equilatero.calcular_area(lado);
	        
	        System.out.println("La altura del triangulo es: " + altura);
	        System.out.println("Su perimetro es: " + perimetro);
	        System.out.println("Y su area es: " + area);

		sc.close();
	    }
	}


	
