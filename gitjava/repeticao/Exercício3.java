package repeticao;

import java.util.Scanner;

public class Exercício3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade = 0, result1 = 0, result2 = 0;
		while (idade != -99) {
			System.out.println("Digite a idade:");
			idade = ler.nextInt();
			if (idade < 21 && idade > 0) {
				result1 = (result1 + 1);
			} else if (idade > 50) {
				result2 = (result2 + 1);

			}
		}
		System.out.println(+result1 + " pessoas tem menos de 21 anos");
		System.out.println("\n" + result2 + " pessoas tem mais de 50 anos");
		System.out.println("\n Fim");
	}

}
