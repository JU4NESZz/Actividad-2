package Ejercicio19;

public class triangulo_equilatero {
	
	
	public static double calcular_altura(double lado); {
        return (lado + Math.sqrt(3)) / 2;
    }
    public static double calcular_perimetro(double lado); {
        return lado * 3;
    }
    public static double calcular_area(double lado); {
        return (Math.pow(lado, 2) * Math.sqrt(3)) / 4;
    }
}

