package repeticao;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int num = 0, media = 0, calculo = 0, contador = 0;
		do {
			System.out.println("Digite número:");
			num = read.nextInt();

			if ((num % 3 == 0) && num > 0) {
				calculo += num;
				contador++;

			} else if (num == 0) {
				break;
			}
		} while (true);
		media = (calculo / contador);
		System.out.println("A média de multiplos de 3 é: " + media);
	}

}
