package Condicional;

import java.util.Scanner;

public class Exercício3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a, b, c, d, aa, bb, cc, dd;

		System.out.println("Entre com primeiro número:");
		a = ler.nextInt();
		aa = (a * a);

		System.out.println("Entre com segundo número:");
		b = ler.nextInt();
		bb = (b * b);

		System.out.println("Entre com terceiro número:");
		c = ler.nextInt();
		cc = (c * c);

		System.out.println("Entre com quarto número:");
		d = ler.nextInt();
		dd = (d * d);

		if (cc >= 1000) {
			System.out.println("O resultado do quadrado do terceiro número é:" + cc);
		} else {
			System.out.println("O quadrado de " + a + " é: " + aa);
			System.out.println("O quadrado de " + b + " é: " + bb);
			System.out.println("O quadrado de " + c + " é: " + cc);
			System.out.println("O quadrado de " + d + " é: " + dd);
		}

	}

}
