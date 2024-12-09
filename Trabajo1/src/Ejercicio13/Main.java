package Ejercicio13;
import java.util.Scanner;
public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.print("Ingrese el valor de la compra: ");
	        double valorCompra = scanner.nextDouble();
	        scanner.nextLine(); 
	        System.out.print("Ingrese el color de la bolita (Blanco, Verde, Amarillo, Azul, Roja): ");
	        String colorBolita = scanner.nextLine().toUpperCase();

	       
	        double porcentajeDescuento = 0;

	        
	        switch (colorBolita) {
	            case "BLANCO":
	                porcentajeDescuento = 0;
	                break;
	            case "VERDE":
	                porcentajeDescuento = 10;
	                break;
	            case "AMARILLO":
	                porcentajeDescuento = 25;
	                break;
	            case "AZUL":
	                porcentajeDescuento = 50;
	                break;
	            case "ROJA":
	                porcentajeDescuento = 100;
	                break;
	            default:
	                System.out.println("Color de bolita no válido.");
	                return; 
	                }

	        double valorPagar = valorCompra - (porcentajeDescuento * valorCompra / 100);
	        System.out.println("El cliente debe pagar: $" + valorPagar);

	        scanner.close();	    
	    //543450, AZUL    
	    }
	}


