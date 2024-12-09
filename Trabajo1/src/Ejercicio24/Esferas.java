package Ejercicio24;


public class Esferas {
    public static void comparar_pesos(double a, double b, double c){
        if(a>b && a>c){
            System.out.println("La esfera A es la mas pesada.");
        }
        else if(b>a && b>c){
            System.out.println("La esfera B es la mas pesada.");
        }
        else if(c>a && c>b){
            System.out.println("La esfera C es la mas pesada.");
        }
        else if(a==b && a>c){
            System.out.println("Las esferas A y B son las mas pesadas.");
        }
        else if(a==c && a>b){
            System.out.println("Las esferas A y C son las mas pesadas.");
        }
        else if(b==c && b>a){
            System.out.println("Las esferas B y C son las mas pesadas.");
        }
        else{
            System.out.println("Las tres esferas pesan lo mismo.");
        }
    }
}