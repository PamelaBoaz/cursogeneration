package matrizVetor;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int ocorrencias = 0, soma = 0, maior = 0, media;
		int[] dado = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite o valor do lançamento" + i + 1 + ":");
			dado[i] = read.nextInt();

			if (dado[i] <= 0 || dado[i] > 6) {
				System.out.println("Entrada inválida! Reinicie o programa.");
				i -= 1;
			} else {
				soma += dado[i];
			}

		}

		media = (soma / 10);
		System.out.println("A média dos lançamentos foi:" + media);

		for (int i = 0; i < 10; i++) {
			if (dado[i] > maior) {
				ocorrencias = 0;
				maior = dado[i];
				ocorrencias++;

			} else if (dado[i] == maior) {
				ocorrencias += 1;
			}

		}
		System.out.println("Maior:" + maior + " ocorreu " + ocorrencias + " vezes.");

	}
}
