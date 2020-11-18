package repeticao;

import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int numero, produto;
		System.out.println("Entre com número:");
		numero = read.nextInt();

		while (true) {

			produto = (numero * 3);
			System.out.println(produto);
			numero = produto;

			if (produto > 100) {
				break;
			}

		}
	}

}
