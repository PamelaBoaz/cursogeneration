package Condicional;

import java.util.Scanner;

public class Exercício8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0;
		System.out.println("Digite um número:");
		numero = ler.nextInt();

		if (numero > 100) {
			System.out.println("Número é: " + numero);
		} else {
			numero = 0;
			System.out.println("Número é: " + numero);
		}

	}

}
