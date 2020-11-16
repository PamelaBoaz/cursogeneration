package Condicional;

import java.util.Scanner;

public class Exercício6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0;
		System.out.println("Nadadores por Categoria");
		System.out.println("Digite sua idade:");
		idade = ler.nextInt();

		if (idade > 5 && idade <= 7) {
			System.out.println("Sua categoria é: Infantil A");
		} else if (idade > 8 && idade <= 11) {
			System.out.println("Sua categoria é: Infantil B");
		} else if (idade > 12 && idade <= 13) {
			System.out.println("Sua categoria é: Juvenil A");
		} else if (idade > 14 && idade <= 17) {
			System.out.println("Sua categoria é: Juvenil B");
		} else {
			System.out.println("Sua categoria é: Adulto");
		}

	}

}
