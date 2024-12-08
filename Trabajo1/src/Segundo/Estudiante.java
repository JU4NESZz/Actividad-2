package Segundo;

public class Estudiante {
	String NI;
	String N;
	double P;
	int ES;
	double cobro;
	
	public  Estudiante(String NI, String N, double P, int ES) {
		
		this.NI = NI;
		this.N = N;
		this.P = P;
		this.ES = ES;
		if(P>2000000.0) {
			this.cobro = P * 0.013;
		}else {
			this.cobro = 50000.0;
			
		}
		System.out.println("El estudiante con numero de inscripcion " + NI + " debe pagar: $" + cobro);
	}
}
