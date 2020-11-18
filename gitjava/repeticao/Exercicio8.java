package repeticao;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int contador = 0, media = 0, soma = 0, lidos = 0, numero = 0;

		while (true) {
			System.out.println("Digite número:");
			numero = read.nextInt();
			contador++;

			if (numero >= 0) {
				soma += numero;
				media = (soma / contador);
				lidos = contador;
			}

			else {
				break;
			}
		}
		System.out.println("O total da soma dos valores é " + soma + " ,a média dos valores é " + media
				+ " e a quantidade de valores lidos foi " + lidos + ".");
	}
}
