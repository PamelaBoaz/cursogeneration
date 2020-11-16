package Condicional;

import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int p, e, m;

		System.out.println("Entre com peso:");
		p = ler.nextInt();

		if (p > 50) {
			e = (p - 50);
			m = (e * 4);
			System.out.println("O peso excedeu em:" + e);
			System.out.println("O valor da multa é R$ :" + m);

		} else {
			e = 0;
			m = 0;
			System.out.println("O peso excedeu em:" + e);
			System.out.println("O valor da multa em:" + m);

		}

	}

}
