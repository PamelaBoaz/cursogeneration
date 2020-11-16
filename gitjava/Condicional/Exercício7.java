package Condicional;

import java.util.Scanner;

public class Exercício7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("Calculando a área do traiângulo");
		int altura = 0, base = 0, area = 0;
		System.out.println("Digite o valor da base: ");
		base = ler.nextInt();
		System.out.println("Digite o valor da altura: ");
		altura = ler.nextInt();

		if (altura > 0 && altura > 0) {
			area = (base * altura) / 2;
			System.out.println("A área do triângulo é: " + area);
		} else {
			System.out.println("Você digitou número inválido!");
		}
	}

}
