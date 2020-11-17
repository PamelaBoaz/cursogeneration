package Condicional2;

import java.util.Scanner;

public class Exercício1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int valor1, valor2;

		System.out.println("Entre com primeiro valor:");
		valor1 = ler.nextInt();
		System.out.println("Entre com o segundo valor:");
		valor2 = ler.nextInt();

		if (valor1 > valor2) {
			System.out.println("O maior valor é: " + valor1);

		} else if (valor2 > valor1) {
			System.out.println("O maior valor é: " + valor2);
		} else {
			System.out.println("Valor digitado inválido, reinicie o programa");
		}

	}

}
