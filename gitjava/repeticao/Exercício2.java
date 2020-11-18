package repeticao;

import java.util.Scanner;

public class Exercício2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int numero, calculo, par = 0, impar = 0;
		for (int contador = 0; contador < 10; contador++) {
			System.out.println("Entre com número:");
			numero = ler.nextInt();
			calculo = (numero % 2);
			if (calculo == 0) {
				par = par + 1;
			} else {
				impar = impar + 1;
			}

		}
		System.out.println("A quantidade de pares é:" + par);
		System.out.println("A quantidade de ímpares é:" + impar);

	}
}