package PacoteJava;

import java.util.Scanner;

public class Operadores5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int idames,anos, meses, dias, totaldias;
		
		System.out.println("Escreva sua idade em anos:");
		anos = ler.nextInt();
		
		System.out.println("\n Agora coloque quantos meses você tem:");
		meses = ler.nextInt();
		
		System.out.println("\n Digite por último quantos dias:");
		dias = ler.nextInt();
		
		totaldias = ( (anos*365) + (meses*30) + (dias*1));
		System.out.println("Sua idade em dias é: " +totaldias+ " dias!");
		
	}

}
