package Ejercicio18;
public class Empleado{
    
    public static double calcular_porcentaje_retencion(double retencion_fuente); {
        return retencion_fuente/100;
    }
    public static double calcular_salario_bruto(double valor_horas, int horas_trabajadas); {
        return valor_horas * horas_trabajadas;
    }
    public static double calcular_salario_neto(double salario_bruto, double retencion_fuente); {
        return salario_bruto - (porcentaje_retencion * salario_bruto);
    }
}