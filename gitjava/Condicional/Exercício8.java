package Condicional;

import java.util.Scanner;

public class Exerc�cio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0;
		System.out.println("Digite um n�mero:");
		numero = ler.nextInt();

		if (numero > 100) {
			System.out.println("N�mero �: " + numero);
		} else {
			numero = 0;
			System.out.println("N�mero �: " + numero);
		}

	}

}
