package Condicional;

import java.util.Scanner;

public class Exerc�cio3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, aa, bb, cc, dd;

		System.out.println("Entre com primeiro n�mero:");
		a = ler.nextInt();
		aa = (a * a);

		System.out.println("Entre com segundo n�mero:");
		b = ler.nextInt();
		bb = (b * b);

		System.out.println("Entre com terceiro n�mero:");
		c = ler.nextInt();
		cc = (c * c);

		System.out.println("Entre com quarto n�mero:");
		d = ler.nextInt();
		dd = (d * d);

		if (cc >= 1000) {
			System.out.println("O resultado do quadrado do terceiro n�mero �:" + cc);
		} else {
			System.out.println("O quadrado de " + a + " �: " + aa);
			System.out.println("O quadrado de " + b + " �: " + bb);
			System.out.println("O quadrado de " + c + " �: " + cc);
			System.out.println("O quadrado de " + d + " �: " + dd);
		}

	}

}
