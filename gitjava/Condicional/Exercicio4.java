package Condicional;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0, par = 0;
		System.out.println("Entre com n�mero:");
		numero = ler.nextInt();
		par = (numero % 2);

		if (par == 0) {
			System.out.println("O numero � par!");
			if (numero >= 0) {
				System.out.println("O n�mero � positivo!");
			} else {

				System.out.println("O n�mero � negativo");
			}
		}

		else {
			System.out.println("O n�mero � �mpar!");

			if (numero >= 0) {
				System.out.println("O n�mero � positivo");

			} else {
				System.out.println("O n�mero � negativo");
			}
		}
	}
}


