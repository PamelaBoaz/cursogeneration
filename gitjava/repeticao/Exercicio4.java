package repeticao;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero = 0, soma = 0, contador = 0;

		do {
			System.out.println("Digite número:");
			numero = ler.nextInt();
			if (numero != 0) {
				soma += numero;
				contador++;
			} else if (numero == 0) {
				break;

			}

		} while (true);
		System.out.println("A soma dos números é: " + soma + " e a quantidade de vezes foi igual a: " + contador);

	}

}
