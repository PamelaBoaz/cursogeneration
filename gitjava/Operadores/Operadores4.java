package PacoteJava;

import java.util.Scanner;

public class Operadores4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int segtotais, horas, minutos, segundos;
		
		System.out.println("Digite os segundos:");
		
		segtotais = ler.nextInt();
		horas = (segtotais/60)/60;
		minutos = (segtotais - (horas*60))/60;
		segundos = segtotais - (horas + minutos);
		
		System.out.println("O total  é  "  +horas+ "  horas " +minutos+ "  minutos " +segundos+ "  segudos.");
		
		
		


	}
	

}
