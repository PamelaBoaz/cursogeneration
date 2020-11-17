package Condicional2;

import java.util.Scanner;

public class Exercício3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double quantidade, total;
		System.out.println("Entre com a quantidade de maçãs compradas:");
		quantidade = ler.nextDouble();

		if (quantidade < 12) {
			total = (quantidade * 0.30);
			System.out.println("Valor total da compra R$" + total);

		} else {
			total = (quantidade * 0.20);
			System.out.println("Valor total da compra R$" + total);
		}
	}

}
