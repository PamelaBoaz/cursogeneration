package repeticao;

import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero, contador = 0, soma = 0;
		System.out.println("Digite um número:");
		numero = read.nextInt();
		do {
			soma = (contador + soma);
			contador = (contador + 1);

		} while (contador <= numero);
		System.out.println("Soma:" + soma);

	}

}
