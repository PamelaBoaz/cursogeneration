package Condicional;

import java.util.Scanner;

public class Exerc�cio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0;
		System.out.println("Nadadores por Categoria");
		System.out.println("Digite sua idade:");
		idade = ler.nextInt();

		if (idade > 5 && idade <= 7) {
			System.out.println("Sua categoria �: Infantil A");
		} else if (idade > 8 && idade <= 11) {
			System.out.println("Sua categoria �: Infantil B");
		} else if (idade > 12 && idade <= 13) {
			System.out.println("Sua categoria �: Juvenil A");
		} else if (idade > 14 && idade <= 17) {
			System.out.println("Sua categoria �: Juvenil B");
		} else {
			System.out.println("Sua categoria �: Adulto");
		}

	}

}
