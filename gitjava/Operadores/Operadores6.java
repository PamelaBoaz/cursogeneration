package PacoteJava;

import java.util.Scanner;

public class Operadores6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int diastotais, anos, meses, dias, resto;
		
		System.out.println("Entre com sua idade total em dias:");
		diastotais = ler.nextInt();
		
		anos = (diastotais/365);
		resto = (diastotais % 365);
		meses = (resto / 30);
		dias = (resto % 30);
		
		System.out.println("Sua idade é  " +anos+ " anos " +meses+ " meses " +dias+ "  dias ");
		
		
		
	}

}
