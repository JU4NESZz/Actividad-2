package Ejercicio21;
public class Triangulo {
    
    public static double calcular_perimetro(double lado_1, double lado_2, double lado_3); {
        return lado_1 + lado_2 + lado_3;
    }
    public static double calcular_semiperimetro(double perimetro); {
        return perimetro/2;
    }
    public static double calcular_area(double lado_1, double lado_2, double lado_3, double semiperimetro); {
        return Math.sqrt(semiperimetro * (semiperimetro-lado_1)*(semiperimetro-lado_2)(semiperimetro-lado_3));
    }
}