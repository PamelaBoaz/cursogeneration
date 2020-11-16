package Condicional;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0, par = 0;
		System.out.println("Entre com número:");
		numero = ler.nextInt();
		par = (numero % 2);

		if (par == 0) {
			System.out.println("O numero é par!");
			if (numero >= 0) {
				System.out.println("O número é positivo!");
			} else {

				System.out.println("O número é negativo");
			}
		}

		else {
			System.out.println("O número é ímpar!");

			if (numero >= 0) {
				System.out.println("O número é positivo");

			} else {
				System.out.println("O número é negativo");
			}
		}
	}
}


