package PacoteJava;

import java.util.Scanner;

public class Operadores2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		float valorFabrica;
		
		double valorFinal;
		
		System.out.println("Entre com valor de fábirca:");
		
		valorFabrica = ler.nextFloat();
		valorFinal = valorFabrica*1.73;
		
		System.out.println("O valor final do veículo é:" +valorFinal);
				
		
		
	}
	

}
