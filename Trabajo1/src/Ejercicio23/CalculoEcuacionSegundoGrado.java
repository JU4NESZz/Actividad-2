package Ejercicio23;

public class CalculoEcuacionSegundoGrado {

    public static void calcularSoluciones(double a, double b, double c) {

        if (b == 0 && c <= 0) {
            if (c < 0) {
                System.out.println("Soluciones de la ecuación:");
                System.out.println("x1 = " + Math.sqrt(-c / a));
                System.out.println("x2 = " + -Math.sqrt(-c / a));
            } else {
                System.out.println("Solución:");
                System.out.println("x = 0");
            }
        } else if (b == 0 && c > 0) {
            System.out.println("La ecuación no tiene solución en los números reales.");
        } else {
            double discriminante = Math.pow(b, 2) - (4 * a * c);

            if (discriminante > 0) {
                System.out.println("Soluciones de la ecuación:");
                System.out.println("x1 = " + ((-b + Math.sqrt(discriminante)) / (2 * a)));
                System.out.println("x2 = " + ((-b - Math.sqrt(discriminante)) / (2 * a)));
            } else if (discriminante == 0) {
                System.out.println("Solución única de la ecuación:");
                System.out.println("x = " + (-b / (2 * a)));
            } else {
                System.out.println("La ecuación no tiene solución en los números reales.");
            }
        }
    }
}