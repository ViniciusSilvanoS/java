package fundamentos;

//import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// (ºF - 32) x 5/9 = ºC
		double f = 80;
		double c;
		final double FATOR = 5.0 / 9.0;
		final int AJUSTE = 32;
		
//		Scanner f = new Scanner (System.in);
		c = (f - AJUSTE)*FATOR;
		System.out.println("Temperatura em Cº é: " + c);

		
		
	}
	
}
