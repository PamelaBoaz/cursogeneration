package repeticao;

import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int soma = 0, impar = 0, calculo = 0;

		for (int contador = 1; contador <= 500; contador++) {

			if (contador % 2 == 1 && contador % 3 == 0) {
				soma += contador;
				impar = soma;

			}

		}
		System.out.println("A soma dos nºs ímpares multiplos de 3 é:" + impar);
	}

}
